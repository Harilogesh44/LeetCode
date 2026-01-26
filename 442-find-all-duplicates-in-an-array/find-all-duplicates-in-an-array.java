class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                 arr.add(nums[i]);
        }
        return arr;
    }
}