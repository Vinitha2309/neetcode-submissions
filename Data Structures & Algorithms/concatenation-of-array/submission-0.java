class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int i=n;
        int arr[]=new int[n+n];
        for(int j=0;j<n;j++){
            arr[j]=nums[j];
            arr[i]=nums[j];
            i++;

        }
        return arr;
        

        
    }
}