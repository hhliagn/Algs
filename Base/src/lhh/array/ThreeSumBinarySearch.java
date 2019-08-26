package lhh.array;

import lhh.base.utils.BinarySearch;

import java.util.Arrays;

public class ThreeSumBinarySearch {

    /**
     * 数组不能有相同元素，否则得出结果不正确
     * 时间复杂度: O(N^2logN)
     * @param nums
     * @return
     */
    public static int threeSum(int[] nums){
        Arrays.sort(nums);
        int cnt = 0;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N - 1; j++){
                int target = -nums[i] - nums[j];
                int index = BinarySearch.search(nums, target);
                if (index > j){
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}
