class Solution {
    public int majorityElement(int[] nums) {
        int freq = 1;
        int n = nums.length;
        

        Arrays.sort(nums);
        int ans = nums[0];
        for (int i = 1; i< n; i++){
            if (nums[i] == nums[i-1]){
                freq++;
            }
            else{
                freq = 1;
                ans = nums[i];
            }
            if(n/2 < freq){
                return ans;
            }
        }
        return ans;
    }
}