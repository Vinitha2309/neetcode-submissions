class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
         int k=nums[n/2];
        return k;
        
    }
}