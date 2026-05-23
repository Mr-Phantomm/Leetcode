class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int countOf5 = 0;
        int countOf10 = 0;
        int countOf20 = 0;
        for(int i=0;i<bills.length;i++){
            int bill = bills[i];
            if(bill==5){
                countOf5++;
            }
            else if(bill==10){
                if(countOf5==0)return false;
                countOf5--;
                countOf10++;
            }
            else{
                if(countOf10>0){
                    if(countOf5==0)return false;
                    countOf10--;
                    countOf5--;
                }
                else{
                    if(countOf5<3)return false;
                    countOf5-=3;
                }
                countOf20++;
            }


        }
        return true;

    }
}