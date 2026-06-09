class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int st = 0;
        int end = n - 1;

        char[] ch = s.toCharArray();

        while(end>st){
            while(st<end && !isVowel(ch[st])){
                st++;
            }

            while(st<end && !isVowel(ch[end])){
                end--;
            }

            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;

            st++;
            end--;

        }
        String ans = new String(ch);
        return ans;
    }

    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}

