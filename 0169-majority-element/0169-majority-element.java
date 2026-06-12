class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        //O(n) time complexity
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }

        // for(int key : map.keySet()){
        //     if(map.get(key)> Math.floor(n/2)){
        //         return key;
        //     }
        // }
        //return -1;



        //Moore's Voting Algo -> O(n) time complexity and O(1) space complexity
        int freq=0;
        int ans=0;;

        for(int i=0;i<n;i++){
            if(freq==0){
             ans = nums[i];
            }

            if(nums[i]==ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}