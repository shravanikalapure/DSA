class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int lmax = 0;
        int rmax = 0;
        int left = 0;
        int right = n -1;

        while(left < right){
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);

            if(lmax < rmax){
                ans += lmax - height[left];
                left++;
            }else{
                ans += rmax - height[right];
                right--;
            }
        }
        return ans;
    }
}