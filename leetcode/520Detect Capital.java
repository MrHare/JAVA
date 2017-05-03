/*
METHOD ONE(79.55% 30ms)
*/
public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] str=word.toCharArray();
        if(str.length<=1)return true;
        if(str[0]<='Z'){
            if(str[1]<='Z'){
                return check(str,true);
            }
        }
        return check(str,false);
    }
    public boolean check(char[] str,boolean isUp){
        if(isUp){
            for(int i=1;i<str.length;i++){
                if(str[i]>'Z')return false;
            }
        }else{
            for(int i=1;i<str.length;i++){
                if(str[i]<'a')return false;
            }
        }
        return true;
    }
}
/*
METHOD TWO(98.96% 26ms)
tips:
the word contains letters only-->judge the upcase through ch<'Z'
length<=1--->true;
length>1:
    if the word are [A-Z]+
    or [A-Z]?[a-z]*
*/
public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] str=word.toCharArray();
        if(str.length<=1)return true;
        if(str[1]<='Z'&&str[0]<='Z'){
            for(int i=1;i<str.length;i++){
                if(str[i]>'Z')return false;
            }
        }else{
            for(int i=1;i<str.length;i++){
                if(str[i]<'a')return false;
            }
        }
        return true;
    }
}
/*
METHOD THREE(17.76% 49ms)
*/
public class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|[A-Z]?[a-z]*");
    }
}