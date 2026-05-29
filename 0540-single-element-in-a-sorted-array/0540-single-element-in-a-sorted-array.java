class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n=nums.length;
       int start=0;
       int end=n-1;
       //single element
       if(n == 1){
        return nums[0];
       }

       while(start<=end){
        int mid = start + (end - start)/2;
        
        //Corner elements
        if(mid==0 && nums[mid]!=nums[mid+1]){
            return nums[mid];
        }
        if(mid==n-1 && nums[mid]!=nums[mid-1]){
            return nums[mid];
        }

        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
            return nums[mid];
        }
        //Even elements on left and right sides
        if(mid%2==0){
            if(nums[mid]==nums[mid-1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        else{ //Odd elements on left and right sides
            if(nums[mid]==nums[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
       }
       return -1;
    }
}