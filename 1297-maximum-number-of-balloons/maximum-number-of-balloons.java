class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('n',0);
        for(int i=0;i<text.length();i++){
            char a=text.charAt(i);
            if(a=='b'||a=='a'||a=='l'||a=='o'||a=='n'){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);       
            }
            else{
                map.put(a,1);
            }
            
            }
        }
        
        if(map.containsKey('l'))map.put('l',map.get('l')/2);
        else{
            map.put('l',0);
        }
        if(map.containsKey('o'))map.put('o',map.get('o')/2);
        else{
            map.put('o',0);
        }
        int min=Integer.MAX_VALUE;
        for(char x : map.keySet()){
            min=min<map.get(x)?min:map.get(x);

        }
        return min;
    }
}