/*
METHOND ONE(38.87% 2ms)
*/
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map=new HashMap<Character,String>();
        char[] chArray=pattern.toCharArray();
        String[] strArray=str.split(" ");
        if(chArray.length!=strArray.length)return false;
        for(int i=0;i<strArray.length;i++){
            if(map.containsKey(chArray[i])){
                if(!map.get(chArray[i]).equals(strArray[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strArray[i]))return false;
                map.put(chArray[i],strArray[i]);
            }
        }
        return true;
    }
}