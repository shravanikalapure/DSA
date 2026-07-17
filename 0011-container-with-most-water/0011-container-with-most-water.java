class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int n = height.length;
        // int lmax = 0;
        // int rmax = 0;
        int l = 0;
        int r = n - 1;
        while(l < r){
            int w = r - l;
            int ht = Math.min(height[l], height[r]);

            int cw = w * ht;

            ans = Math.max(ans, cw);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;

    }
}