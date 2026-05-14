class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int t=m+n;
        int d=n;
        for(int i=0;i<t;i++){
            if(nums1[i]==0 && d!=0){
                nums1[i]=nums2[j++];
                d--;
            }
           
        }
        for(int i=0;i<t-1;i++){
            for(j=0;j<t-i-1;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                    
                }
            }
        }
    }
}