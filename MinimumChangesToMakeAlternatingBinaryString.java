/* Problem link - https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/ */

class Solution {
    public int minOperations(String s) {
       System.out.println(methodOne(s));
       System.out.println(methodTwo(s));
        
       if(methodOne(s)<methodTwo(s)){
           return methodOne(s);
       }
        else{
            return methodTwo(s);
        }
        
    }
    public int methodOne(String s){
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' && i%2 ==0){
                x+=1;
            }
            else if(s.charAt(i)=='1' && i%2==1){
                x+=1;
            }
        }
        return x;
    }
    
    public int methodTwo(String s){
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && i%2 ==0 ){
                x+=1;
            }
            else if(s.charAt(i)=='0' && i%2==1){
                x+=1;
            }
        }
        return x;
    }

}