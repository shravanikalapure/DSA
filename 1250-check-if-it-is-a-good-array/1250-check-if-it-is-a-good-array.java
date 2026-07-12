class Solution {
    public int gcd(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        return gcd(num2, num1%num2);
        // int divisor = num1;
        // int dividend = num2;
        // int remainder = dividend % divisor;
        // if(remainder == 0) return divisor;
        // while(remainder!=0){
        //     dividend = divisor;
        //     divisor = remainder;
        //     remainder = dividend % divisor;
        // }
        // return divisor;
    }
    public boolean isGoodArray(int[] nums) {
        int currGCD = nums[0];
        for(int i = 1; i<nums.length; i++){
            currGCD = gcd(currGCD, nums[i]);
        }
        return (currGCD == 1);
    }
}