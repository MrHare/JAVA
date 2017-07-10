//METHOND ONE(48.32% 15ms)
public class Solution {
    public int search(int[] nums, int target) {    
        if (nums.length == 0)return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (target == nums[mid])return mid;
            if (nums[left] < nums[right]){
                if (target > nums[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                if(nums[mid] > nums[right]){
                    if(target < nums[mid] && target >= nums[left]){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }
                }else{
                    if(target > nums[mid] && target <= nums[right]){
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
//METHOD 1.1(33.33% 16ms)
public class Solution {
    public int search(int[] nums, int target) {    
        if (nums.length == 0)return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (target == nums[mid])return mid;
            if(nums[mid] > nums[right]){
                if(target < nums[mid] && target >= nums[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
//METHOD TWO