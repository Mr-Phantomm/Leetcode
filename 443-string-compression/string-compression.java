class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder("");
        char currChar = (char)256;
        int currFreq = 0;
        for(int i=0;i<chars.length;i++){
            char curr = chars[i];
            if(currChar == (char)256){
                currChar = curr;
                currFreq =1;
            }else{
                if(currChar == curr ){
                    currFreq++;
                }else{
                    if(currFreq == 1) str.append(currChar);
                    else str.append(currChar+""+currFreq);
                    currChar = curr;
                    currFreq = 1;
                }
            }
        }
        if(currFreq == 1) str.append(currChar);
        else str.append(currChar+""+currFreq);
        

        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }



        return str.length();
    }
}