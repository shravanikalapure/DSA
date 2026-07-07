class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                } else if (grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int time =0;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()){
            
            int[] curr = q.poll();  //(i,j),time
            //check neighbours
            int row = curr[0];
            int col = curr[1];
            int t = curr[2];

            time = Math.max(time, t);
            
            for(int k = 0; k < 4; k++){
                int nr = row + dr[k];
                int nc = col + dc[k];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < m &&
                   grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    fresh--;

                    q.offer(new int[]{nr, nc, t+1});
                   }
            }
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }
}