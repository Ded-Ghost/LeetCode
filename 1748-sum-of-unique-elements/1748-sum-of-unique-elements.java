class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum=0;

        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr.remove(Integer.valueOf(nums[i]));

                if(arr.contains(nums[j])){
                    arr.remove(Integer.valueOf(nums[i]));
               
                 }
               }
            }
        }
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}