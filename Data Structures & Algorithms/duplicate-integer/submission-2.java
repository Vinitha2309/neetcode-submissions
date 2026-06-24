class Solution {
    public boolean hasDuplicate(int[] nums){
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
               return true;
            }
            
        }
       
        return false;


    }
        
}