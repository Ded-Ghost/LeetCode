class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int n= part.length();

        while(sb.length()>0 && sb.indexOf(part)!=-1){
            int st = sb.indexOf(part);

            sb.delete(st,st+n);  //end is exclusive
        }
        
        s=sb.toString();

        return s;
    }
}