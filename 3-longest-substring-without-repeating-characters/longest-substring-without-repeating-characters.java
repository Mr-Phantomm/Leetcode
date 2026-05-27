class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map =new HashMap<>();
        int left = 0;
        int right = 0;
        int stringLength = 0;
        while(right<s.length()){

            char ch = s.charAt(right);
            // System.out.println(left+" "+right);
            if(!map.containsKey(ch)){
            }else{
                if(map.get(ch)>=left){
                    left = map.get(ch)+1;
                }
            }
            stringLength = Math.max(right-left+1,stringLength);
            map.put(ch,right);
            right++;
        }
        return stringLength;
    }
}