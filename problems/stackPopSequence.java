import java.util.*;

public class Test{
    /*
    *array1 is a stack push sequence,
    *judge weather array2 is a possible pop sequence of array1
    * return true: possible
    * return false: impossible
    */
    public static boolean testStack(int[] array1,int[] array2){
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        for(int val:array2){
            if(!stack.empty() && stack.peek() == val){
                stack.pop();
            }else{
                while(true){
                    if(index >= array2.length)return false;
                    if(array1[index] == val){
                        index ++;
                        break;
                    }
                    stack.push(array1[index ++]);
                }
            }
        }
        return true;
    }
	public static void main(String[] args){
        int[] array1 = {1,2,3,4};
        int[] array2 = {4,2,3,1};
        System.out.println(testStack(array1, array2));
    }
}
