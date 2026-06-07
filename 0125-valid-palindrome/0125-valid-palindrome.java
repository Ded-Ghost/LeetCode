class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        StringBuilder str = new StringBuilder();
        

        //Regex Method -> str.replaceAll("[^a-zA-Z]","")

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }

        int n = str.length();
        int i=0;
        int j=n-1;

        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}