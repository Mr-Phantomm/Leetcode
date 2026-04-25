class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(!(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/"))){
                num.push(Integer.parseInt(ch));
            }else{
                int secondNum = num.pop();
                int firstNum = num.pop();
                if(ch.equals("+"))num.push(firstNum+secondNum);
                else if(ch.equals("-"))num.push(firstNum-secondNum);
                else if(ch.equals("*"))num.push(firstNum*secondNum);
                else num.push(firstNum/secondNum);
            }
        }
        return num.pop();
    }
}