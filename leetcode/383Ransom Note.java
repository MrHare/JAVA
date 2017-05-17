/*
METHOND ONE(20.33% 72ms)
*/
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list=new ArrayList<Character>();
        for(int i=0;i<magazine.length();i++){
            list.add((Character)magazine.charAt(i));
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!list.remove((Character)ransomNote.charAt(i)))return false;
        }
        return true;
    }
}
/////////////
/*
METHOND TWO(92.03% 14ms)
*/
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ret=new int[26];
        //for(int i=0;i<26;i++)ret[i]=0;
        for(char ch:magazine.toCharArray())ret[ch-'a']++;
        for(char ch:ransomNote.toCharArray()){
            if(--ret[ch-'a']<0)return false;
        }
        return true;
    }
}