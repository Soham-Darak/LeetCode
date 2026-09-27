class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '('){
                stack.push(i);
            }
            else if(sb.charAt(i) == ')'){
                int start = stack.pop();
                String subStr = sb.substring(start+1,i);
                String reverseStr = reverse(subStr);
                sb.replace(start, i+1,reverseStr);
                i -= 2;
            }
        }
        return sb.toString();
    }
    String reverse(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}