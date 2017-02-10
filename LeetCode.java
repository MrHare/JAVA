import java.util.*;
public class LeetCode{
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length=nums1.length+nums2.length;
		int mid=length/2;
		int[] result=new int[mid+2];
		int len1=0,len2=0;
		int i=0;
		while(i<mid+1){
			int tmp1=len1<nums1.length?nums1[len1]:Integer.MAX_VALUE;
			int tmp2=len2<nums2.length?nums2[len2]:Integer.MAX_VALUE;
			if(tmp1<=tmp2){
				result[i++]=tmp1;
				len1++;
			}else{
				result[i++]=tmp2;
				len2++;
			}
			
		}
		if(length%2==1){
			return result[mid];
		}
		return 0.5*(result[mid]+result[mid-1]);

    }
	public static void main(String[] args){
		LeetCode leetCode=new LeetCode();
		int[] nums1={1};
		int[] nums2=new int[]{3,4,5};
		System.out.println(leetCode.findMedianSortedArrays(nums1,nums2));
	}
}