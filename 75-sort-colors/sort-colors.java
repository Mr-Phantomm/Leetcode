class Solution {

    public void swap(int[] nums,int i,int j){
        System.out.println(i+" "+j);
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void sortColors(int[] nums) {
        int validZero = 0;
        int validTwo = nums.length-1;
        int i=0;
        while(i<=validTwo){
            System.out.println(Arrays.toString(nums));
            int curr = nums[i];
            if(curr==0){
                swap(nums,i,validZero);
                validZero++;
                i++;
            }else if(curr==2){
                swap(nums,i,validTwo);
                validTwo--;
            }
            else{
                i++;
            }
        }

    }
}