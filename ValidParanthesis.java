/* Problem link - https://leetcode.com/problems/valid-parentheses/
*/
class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        boolean flag = true;
        // System.out.println(s);
        for(char c: s.toCharArray()){
            // System.out.println(c);
            String temp = Character.toString(c);
            if(temp.equals("{")||temp.equals("[")||temp.equals("(")){
                stack.push(temp);
            }
            else if(temp.equals("}")||temp.equals("]")||temp.equals(")")){
                if(!stack.empty() && stack.peek().equals("{") && temp.equals("}")){
                    stack.pop();
                }
                else if( !stack.empty() && stack.peek().equals("[") && temp.equals("]")){
                    stack.pop();
                }
                else if( !stack.empty() && stack.peek().equals("(") && temp.equals(")")){
                    stack.pop();
                }
                else{
                    flag = false;
                }

            }
        }
        // String s1 = stack.peek();
        // System.out.println(s1);
        if(!flag){return false;}
        else{return s.length()>1?stack.empty():false; }

    }
}