class Solution {
    private int[] prevsmall(int[] heights){
        int n = heights.length;

        int[] small = new int[n];
        Arrays.fill(small, -1);

        Stack<Integer> st1 = new Stack<>();
        for(int i =0; i<n; i++){
            //pop until smaller
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            if (!st1.isEmpty()){
                small[i] = st1.peek();
            }
            st1.push(i);
        }
        return small;
    }

    private int[] nextsmall(int[] heights){
        int n = heights.length;

        int[] nextsmall = new int[n];
        Arrays.fill(nextsmall, n);

        Stack<Integer> st1 = new Stack<>();
        for(int i = n - 1; i>=0; i--){
            //pop until smaller
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            if (!st1.isEmpty()){
                nextsmall[i] = st1.peek();
            }
            st1.push(i);
        }
        return nextsmall;
    }
    public int largestRectangleArea(int[] heights) {
        int[] small = prevsmall(heights);
        int[] nextsmall = nextsmall(heights);
        int maxa = 0;
        int n = heights.length;
        for(int i = 0; i < n; i++){
            int width = nextsmall[i] - small[i] - 1;
            int area = heights[i] * width;
            maxa = Math.max(maxa, area);
        }
        return maxa;
    }
}