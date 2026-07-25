class Solution {
    public long isValid(int[] piles,int k){
        long hours = 0;
        for(int i=0;i<piles.length;i++){
            hours+= piles[i]/k+(piles[i]%k>0?1:0);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(h==piles.length)return piles[piles.length-1];
        int left = 1;
        int right = piles[piles.length-1];
        int speed = piles[piles.length-1];
        while(left<=right){
            int mid = (right-left)/2+left;
            long timeForMid = isValid(piles,mid);
            if(timeForMid<=h){
                speed = Math.min(mid,speed);
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return speed;
    }
}