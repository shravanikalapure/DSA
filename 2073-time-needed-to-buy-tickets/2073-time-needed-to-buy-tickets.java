class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int n = tickets.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            q.offer(i);
        }

        while(!q.isEmpty()){
            int person = q.poll();
            tickets[person]--;
            count++;

            if (person == k && tickets[person] == 0){
                return count;
            }

            if(tickets[person] > 0){
                q.offer(person);
            }
        }
        return count;
    }
}