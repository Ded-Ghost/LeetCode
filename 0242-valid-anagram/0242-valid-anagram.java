class Solution {
    public boolean isAnagram(String s, String t) {
        
        s=s.toLowerCase();
        t=t.toLowerCase();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        //using array inbuilt
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }
}