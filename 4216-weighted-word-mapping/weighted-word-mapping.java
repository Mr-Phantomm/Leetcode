class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder("");
        Map<Integer,Character> map = new HashMap<>();
        map.put(0,'z');
        map.put(1,'y');
        map.put(2,'x');
        map.put(3,'w');
        map.put(4,'v');
        map.put(5,'u');
        map.put(6,'t');
        map.put(7,'s');
        map.put(8,'r');
        map.put(9,'q');
        map.put(10,'p');
        map.put(11,'o');
        map.put(12,'n');
        map.put(13,'m');
        map.put(14,'l');
        map.put(15,'k');
        map.put(16,'j');
        map.put(17,'i');
        map.put(18,'h');
        map.put(19,'g');
        map.put(20,'f');
        map.put(21,'e');
        map.put(22,'d');
        map.put(23,'c');
        map.put(24,'b');
        map.put(25,'a');
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            int ans = 0;
            for(int j=0;j<word.length();j++){
                ans+=weights[word.charAt(j)-'a'];
            }
            ans%=26;

            str.append((char)(map.get(ans)));
        }
        return str.toString();
    }
}