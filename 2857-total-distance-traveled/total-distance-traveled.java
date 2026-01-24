class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       int litres=0;
       while(true){
         if(5<=mainTank && additionalTank!=0){
            litres+=5;
            mainTank-=5;
            mainTank++;
            additionalTank--;
         }
         else{
            litres+=mainTank;
            break;
         }
       }
       return litres*10;
    }
}