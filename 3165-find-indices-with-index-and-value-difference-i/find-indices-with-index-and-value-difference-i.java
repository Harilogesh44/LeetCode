class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}