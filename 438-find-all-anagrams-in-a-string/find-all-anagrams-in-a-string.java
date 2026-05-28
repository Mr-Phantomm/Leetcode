class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int anagramSize = p.length();
        int left =0;
        int right =0;
        List<Integer> list = new ArrayList<>();
        while(right<s.length()){
            int windowLen = right-left+1;
            if(map.containsKey(s.charAt(right))){
                    map.put(s.charAt(right),map.get(s.charAt(right))-1);
                    if(map.get(s.charAt(right))>=0)anagramSize--;
                    if(anagramSize==0)list.add(left);

            }
            // System.out.println(left+" "+right+" "+map);

            if(windowLen==p.length()){
                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                    if(map.get(s.charAt(left))>0)anagramSize++;
                }
                left++;
            }

            right++;
        }

        if(anagramSize==0)list.add(left);
        return list;
        
    }
}