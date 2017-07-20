/*
METHOD ONE(78.81% 29ms)
*/
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < list1.length; i ++){
            map.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i ++){
            if(map.containsKey(list2[i])){
                int tmpSum = i + map.get(list2[i]);
                if(tmpSum > min)continue;
                if(tmpSum < min){
                    min = tmpSum;
                    list.clear();
                }
                list.add(list2[i]);
            }
        }
        String[] ret = new String[list.size()];
        int i = 0;
        for(String str : list){
            ret[i ++] = str;
        }
        return ret;
    }
}