class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        Set<String> used=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int currSum=nums[i]+nums[j];
                if(map.containsKey(-1*currSum)){
                int k=map.get(-1*currSum);

            if(!used.contains(nums[i] + ":"+ nums[j] +":" + nums[k]) && (i<k && j<k))
                   {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    used.add(nums[i] + ":"+ nums[j] +":" + nums[k]);
                   }
                }
            }
        }
        return result;
        
    }
}