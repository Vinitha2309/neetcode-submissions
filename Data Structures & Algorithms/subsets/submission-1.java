class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num:nums){
            int size=list.size();
            for(int i=0;i<size;i++){
                List<Integer> newsubset=new ArrayList<>(list.get(i));
                newsubset.add(num);
                list.add(newsubset);
            }
        }
        return list;
        
    }
}
