class Solution {

    public int binaryToInteger(String str){
        int ans = 0;
        int multiplier = 1;
        // System.out.println(str);
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                ans += multiplier;
            }
            multiplier*=2;
        }
        return ans;
    }
    public String intToString(int n,int size){
        StringBuilder str = new StringBuilder("");
        size=size-1;
        while(n>0){
            int power = (int)Math.pow(2,size);
            if(n>=power){
                str.append("1");
                n-=power;
            }
            else{
                str.append("0");
            }
            size--;

        }
        while(size>=0){
            str.append("0");
            size--;
        }
        return str.toString();
        
    }

    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(binaryToInteger(nums[i]));
        }

        // System.out.println(set);

        for(int i=0;i<Math.pow(2,nums.length);i++){
            if(!set.contains(i)){
                // System.out.println(i);
                return intToString(i,nums.length);
            }
        }
        return "";
    }
}