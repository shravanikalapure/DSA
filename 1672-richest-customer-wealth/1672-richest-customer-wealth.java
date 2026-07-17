class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;  //colm
        int ans = 0;
    
        for(int i = 0; i < m; i++){
            int sum = 0;   //reset for each customer
                for(int j = 0; j < n; j++){
                    sum += accounts[i][j];
                }

                ans = Math.max(ans, sum);
        }
        return ans;
    }
}