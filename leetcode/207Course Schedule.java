//TIme Limited Exceeded
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> fin=new ArrayList<Integer>();
        int len=numCourses;
        int[][] req=new int[len][len+1];
        for(int i=0;i<len;i++)
            for(int j=0;j<len+1;j++){
                req[i][j]=0;
            }
        for(int i=0;i<prerequisites.length;i++){
            req[prerequisites[i][0]][prerequisites[i][1]]=1;
            req[prerequisites[i][0]][len]++;
        }
        for(int i=0;i<len;i++){
            if(req[i][len]==0){
                req[i][len]--;
                fin.add(i);
            }
        }
        for(int i=0;i<fin.size();i++){
            foo(req,fin.get(i),fin);
        }
        return len==fin.size();
    }
    public void foo(int[][] req,int tar,List<Integer> fin){
        for(int i=0;i<req.length;i++){
            if(req[i][tar]==1){
                req[i][req.length]--;
                if(req[i][req.length]==0){
                    req[i][req.length]--;
                    fin.add(i);
                }
            }
        }
    }
}
//--------------------------
/*
METHOD ONE(3.45% 138ms)
*/
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
        for(int i=0;i<prerequisites.length;i++){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }else{
                List<Integer> list=new ArrayList<Integer>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0],list);
            }
        }
        while(removeReq(map));
        return map.size()==0;
    }
    public boolean removeReq(Map<Integer,List<Integer>> map){
        boolean isFinish=false;
        Iterator<Integer> ite=map.keySet().iterator();
        while(ite.hasNext()){
            List<Integer> list=map.get(ite.next());
            Iterator<Integer> iterator=list.iterator();
            while(iterator.hasNext()){
                Integer i=(Integer) iterator.next();
                if(!map.containsKey(i)){
                    iterator.remove();
                    if(list.size()==0){
                        ite.remove();
                        isFinish=true;
                    }
                }
            }
        }
        return isFinish;
    }
}