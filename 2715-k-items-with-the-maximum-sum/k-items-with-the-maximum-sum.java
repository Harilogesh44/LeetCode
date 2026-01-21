class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int takeOnes=Math.min(numOnes,k);
        int sum=takeOnes;
        k-=takeOnes;
        
        int takeZeros=Math.min(numZeros,k);
        k-=takeZeros;

        sum-=Math.min(numNegOnes,k);
        return sum;
    }
}