class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        int count = 0;

        for(int i=0;i<tickets.length;i++){
                q.add(new int[]{i, tickets[i]});
            }
        
        while(!q.isEmpty()){
            int[] person = q.poll();

            person[1]--;
            count++;

            if(person[1] == 0){
                if(person[0]==k){
                    return count;
                }
            }
                else{
                    q.add(person);
                }
        }
        return count;
    }
}