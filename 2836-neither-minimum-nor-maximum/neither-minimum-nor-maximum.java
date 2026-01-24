class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int i=0;
        while(nums.length>2){
            if(nums[i]!=min && nums[i]!=max)
             return nums[i];
         i++;
        }
        return -1;
    }
}