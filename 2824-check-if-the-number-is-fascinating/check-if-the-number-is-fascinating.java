class Solution {
    public boolean isFascinating(int n) {
        String str=""+n+(2*n)+(3*n);
        if(str.length()!=9)
        return false;
        int[] count=new int[10];
        for(char c:str.toCharArray()){
         int digit=c-'0';
         if(digit==0)
          return false;
          count[digit]++;
        }
        for(int i=1;i<=9;i++){
            if(count[i]!=1)
             return false;
        }
        return true;
    }
}