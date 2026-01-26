class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       /* Arrays.sort(nums);
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                 arr.add(nums[i]);
        }
        return arr;
        */
         List<Integer> arr=new ArrayList<Integer>();
         for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                arr.add(index+1);
            }
            else{
                nums[index]=-nums[index];
            }
         }
        return arr;
    }
}