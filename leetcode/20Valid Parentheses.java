/*
METHOD ONE(14.24% 14ms)
*/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss=new Stack<Character>();
        char[] array=s.toCharArray();
        for(char ch:array){
            switch(ch){
                case '[':ss.push(ch);break;
                case '(':ss.push(ch);break;
                case '{':ss.push(ch);break;
                case ']':{
                    if(!ss.empty()&&ss.peek()=='['){
                        ss.pop();
                    }else{
                        return false;
                    }
                    break;
                }
                case ')':{
                    if(!ss.empty()&&ss.peek()=='('){
                        ss.pop();
                    }else{
                        return false;
                    }
                    break;
                }
                case '}':{
                    if(!ss.empty()&&ss.peek()=='{'){
                        ss.pop();
                    }else{
                        return false;
                    }
                    break;
                }
                default:
            }
        }
        return ss.empty();
    }
}
/*
METHOD TWO(64.31% 10 ms)
tips
the string contain s [,],{,},(,) only
push the opposite character
*/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss=new Stack<Character>();
        char[] array=s.toCharArray();
        for(char ch:array){
            switch(ch){
                case '(':ss.push(')');break;
                case '[':ss.push(']');break;
                case '{':ss.push('}');break;
                default:if(ss.empty()||ss.pop()!=ch)return false;
            }
        }
        return ss.empty();
    }
}