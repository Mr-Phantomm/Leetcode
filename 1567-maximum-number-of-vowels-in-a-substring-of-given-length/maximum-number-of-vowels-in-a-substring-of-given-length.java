class Solution {
    public int maxVowels(String s, int k) {
        int left = 0; 
        int right = k-1 ;
        int vowelInWindow = 0;
        for(int i=0;i<k-1;i++){
            if("aeiou".indexOf(s.charAt(i))>=0)vowelInWindow++;
        }
        int max = vowelInWindow;

        while(right<s.length()){

            if("aeiou".indexOf(s.charAt(right))>=0)vowelInWindow++;
            // System.out.println(left+" "+right+" "+vowelInWindow);
            max = Math.max(max,vowelInWindow);
            if("aeiou".indexOf(s.charAt(left))>=0)vowelInWindow--;
            left++;
            right++;
        }
        return max;
    }
}