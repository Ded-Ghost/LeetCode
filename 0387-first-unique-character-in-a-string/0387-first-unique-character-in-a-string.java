class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                q.add(i);
            }
            map.put(ch,map.getOrDefault(ch,0)+1); //increase freq by 1

            //char c = s.charAt(q.peek()) = top element

            while(!q.isEmpty() && map.get(s.charAt(q.peek()))>1){ //value of ch>1
                q.remove();
            }
        }
        return q.isEmpty() ? -1 : q.peek(); //if q.isEmpty() is true return -1 else top index of queue
    }
}