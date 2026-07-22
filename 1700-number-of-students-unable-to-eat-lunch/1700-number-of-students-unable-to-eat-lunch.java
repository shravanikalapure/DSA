class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       
        Queue<Integer> q = new LinkedList<>();

        //add students to the queue
        for(int student: students){
            q.offer(student);
        }

        int sidx = 0;
        int rotations = 0;

        while(!q.isEmpty()){
            //if front student likes the sandwitch
            if(q.peek() == sandwiches[sidx]){
                q.poll();
                sidx++;
                rotations = 0;
            }else{
                q.offer(q.poll());
                rotations++;

                if(rotations == q.size()){
                    break;
                }
            }
        }
        return q.size();
    }
}