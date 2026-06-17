class Solution {
    public char processStr(String s, long k) {
        
        long len = 0;
        
        //O(n) time complexity

        //Forward Pass - for getting the length of the resultant string
        for(char ch : s.toCharArray()){

            if(ch>='a' && ch<='z'){
                len++;
            }
            else if(ch == '*'){
                if(len>0){
                    len--;
                }
            }
            //Doubles the length
            else if(ch == '#'){
                len = len*2;
            }
        //% - reverse has the same length
        }

        if(k>=len){
            return '.';
        }

        //BackWard Pass - To get the character at kth index
        for(int i=s.length()-1;i>=0;i--){
           char ch = s.charAt(i);

            if(ch == '*'){
                len++;
            }
            else if(ch == '#'){
                len = len/2;
                if(k>=len){
                    k=k-len;
                }
            }
            else if(ch == '%'){
                k = len-k-1;
            }
            else{
                len--;
                if(len==k){
                    return ch;
                }
            }
        }

        return '.';
    }
}