class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left =0;
        int right = 0;
        int maxLen =0;
        while(right<s.length()){
            char ch = s.charAt(right);
            // System.out.println(left+" "+right);'/'
            if(!map.containsKey(ch)){
                map.put(ch,right);
            }else{
                if(map.get(ch)>=left){
                    left=map.get(ch)+1;
                }
            }
            map.put(ch,right);
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}