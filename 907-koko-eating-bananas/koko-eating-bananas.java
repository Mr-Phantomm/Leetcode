class Solution {
    public long isValid(int[] piles,int k){
        long hours = 0;
        for(int i=0;i<piles.length;i++){
            hours+= piles[i]/k+(piles[i]%k>0?1:0);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }
        if(h==piles.length)return max;
        int left = 1;
        int right = max;
        int speed = max;
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