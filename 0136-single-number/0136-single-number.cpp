class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;              //use XOR operation to cancel out duplicates
        for (int val : nums){
            ans = ans ^ val;
        }
        return ans;
    }
};