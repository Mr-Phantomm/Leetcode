class Solution {

    public boolean checkPossible(int[] piles,int hours,int perHourBanana){
        for(int i=0;i<piles.length;i++){
            int requiredHoursToClearPile = piles[i]/perHourBanana+(piles[i]%perHourBanana==0?0:1);
            if(hours<requiredHoursToClearPile)return false;
            hours-=requiredHoursToClearPile;
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        int ans = -1;
        while(start<=end){
            int mid = (end-start)/2+start;
            boolean midPossible = checkPossible(piles,h,mid);
            if(midPossible){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}