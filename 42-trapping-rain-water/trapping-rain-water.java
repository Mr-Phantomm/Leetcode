class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0]=0;
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }
        rightMax[height.length-1]=0;
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        int ans = 0 ;
        for(int i=1;i<height.length-1;i++){
            if(Math.min(leftMax[i],rightMax[i])-height[i]>0)
            ans += Math.min(leftMax[i],rightMax[i])-height[i];
            System.out.print(Math.min(leftMax[i],rightMax[i])-height[i]+" ");
        }
        return ans;
    }
}