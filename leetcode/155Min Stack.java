/*
METHOD ONE(0.25% 273 ms)
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        int length=0;
        ListNode travel=head;
        while(travel!=null){
            length++;
            travel=travel.next;
        }
        if(length<3)return;
        travel=head;
        for(int i=0;i<(length)/2;i++){
            travel=travel.next;
        }
        ListNode tmp=travel;
        travel=travel.next;
        tmp.next=null; 
        ListNode start=travel;
        travel=travel.next;
        start.next=null;
        while(travel!=null){
            tmp=travel;
            travel=travel.next;
            tmp.next=start;
            start=tmp;
        }
        travel=head;
        while(start!=null){
            tmp=start;
            start=start.next;
            tmp.next=travel.next;
            travel.next=tmp;
            travel=travel.next.next;
        }
    }
}
/*
//---------------------------------------------------------
METHOD TWO(2.39 203ms)
arraylist is faster!
*/
public class MinStack {
    int top=0;
    List<Integer> sList;
    /** initialize your data structure here. */
    public MinStack() {
        top=-1;
        sList=new ArrayList<Integer>();
    }
    public void push(int x) {
        sList.add(x);
        top++;
    }
    
    public void pop() {
        sList.remove(top);
        top--;
        
    }
    
    public int top() {
        return sList.get(top);
    }
    
    public int getMin() {
        int result=sList.get(0);
        for(int i=1;i<=top;i++){
            int tmp=sList.get(i);
            result=tmp<result?tmp:result;
        }
        return result;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
/*
------------------------------------------------------------------
METHOD 2.1(57.01% 119ms)
tips:little change base on method two
record the minIndex,
-if the push val is smaller than the list.get(minrecord)
change the minIndex as top,
-if the index of pop val is minIndex,travel the list and update the minIndex 
*/
public class MinStack {
    int top=-1;
    int minIndex=0;
    List<Integer> list;
    /** initialize your data structure here. */
    public MinStack() {
        list=new ArrayList<Integer>();
    }
    public void push(int x) {
        top++;
        list.add(top,x);
        if(x<list.get(minIndex))minIndex=top;
    }
    public void pop() {
        list.remove(top);
        top--;
        if(top<minIndex){
            minIndex=0;
            for(int i=0;i<=top;i++){
                if(list.get(i)<list.get(minIndex))minIndex=i;
            }
        }
    }
    public int top() {
        return list.get(top);
    }
    
    public int getMin() {
        return list.get(minIndex);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 /*
 //-----------------------------------------------------------------
 METHOD THREE(57.01% 119ms)
 1.use int[] array arry[0] store the min of this array,if the input is beyond 
 the the size of the array,build a new array
 2.use list<int[]> store the int[]
 3. travel the array[0] of the list,get the min
 */
 public class MinStack {
    int line=0;
    int top=0;
    int size=1000;
    List<int[]> list=new ArrayList<int[]>();
    /** initialize your data structure here. */
    public MinStack() {
        int[] array=new int[size];
        array[0]=1;
        list.add(line,array);
    }
    public void push(int x) {
        top++;
        if(top>=size){
            int[] array=new int[size];
            line++;
            list.add(line,array);
            array[0]=1;
            top=1;
            array[top]=x;
        }else{
            int[] tmp=list.get(line);
            tmp[top]=x;
            if(x<tmp[tmp[0]]){
                tmp[0]=top;
            }
        }
    }
    public void pop() {
        top--;
        if(top<1){
            top=size-1;
            list.remove(line);
            line--;
        }else{
            int[] tmp=list.get(line);
            if(top<tmp[0]){
                int val=1;
                for(int i=1;i<=top;i++){
                    if(tmp[i]<tmp[val])val=i;
                }
                tmp[0]=val;
            }
        }
    }
    public int top() {
        return list.get(line)[top];
    }
    
    public int getMin() {
        int[] tmp=list.get(0);
        int result=tmp[tmp[0]];
        for(int i=1;i<=line;i++){
            tmp=list.get(i);
            if(tmp[tmp[0]]<result)result=tmp[tmp[0]];
        }
        return result;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
