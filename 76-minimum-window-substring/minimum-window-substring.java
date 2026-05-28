class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int left =0;
        int right =0;
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int size = t.length();
        String ans = "";

        while(right<s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0)size--;
                if(size==0){
                    if(ans=="")ans=s.substring(left,right+1);
                    while(size==0){
                        String str = s.substring(left,right+1);
                        ans = ans.length()<str.length()?ans:str;
                        if(map.containsKey(s.charAt(left))){
                            map.put(s.charAt(left),map.get(s.charAt(left))+1);
                            if(map.get(s.charAt(left))>0)size++;    
                        }
                        left++;
                    }
                }
            }

            right++;
        }

        return ans;
    }
}