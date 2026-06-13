/**
 * @param {number[]} nums
 * @return {number}
 */
var repeatedNTimes = function(nums) {
   const n= nums.length;
    for(let i=0;i<n;i++){
        for(let j=i+1;j<n;j++){
            if(nums[j]==nums[i]){
                return nums[i];
            }
        }
    }
};