class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
           int max=0;
           int count=0;
           for(int j=0;j<nums.length;j++){
             if(nums[j]==1){
                count++;
                max=Math.max(max,count);

             }
             else{
                count=0;
             }
            
            
           }
        
        return max;
    }
}