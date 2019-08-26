package lhh.base.utils;

public class BinarySearch {

    public static int search(int[] nums, int target){
        int l = 0;
        int h = nums.length;
        while (l < h){
            int m = (l + h) / 2;
            if (nums[m] > target){
                h = m - 1;
            }else if (nums[m] < target){
                l = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
