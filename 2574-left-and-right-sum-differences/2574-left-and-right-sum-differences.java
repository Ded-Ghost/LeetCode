class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] LeftSum = new int[n];
        int[] RightSum = new int[n];
        int[] ans = new int[n];
        
        //RightSum
        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=i+1;j<n;j++){
                sum += nums[j];
            }
            RightSum[i] = sum;
        }

        //LeftSum
        for(int i=n-1;i>=0;i--){
            int sum=0; 
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
            }
            LeftSum[i]=sum;
        }
        
        for(int i=0;i<n;i++){
            ans[i] = Math.abs(LeftSum[i]-RightSum[i]);
        }
     return ans;
    }
}