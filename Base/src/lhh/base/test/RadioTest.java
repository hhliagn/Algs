package lhh.base.test;

import lhh.array.ThreeSumBinarySearch;

public class RadioTest {

    /**
     * 时间复杂度: O(N^2logN)
     * T(2N)/T(N) ~ 2^2
     * @param args
     */
    public static void main(String[] args) {
        int N = 500;
        int loopTime = 7;
        double preTime = -1;
        while (loopTime -- > 0){
            int[] nums = new int[N];
            StopWatch.start();
            int cnt = ThreeSumBinarySearch.threeSum(nums);
            //System.out.println(cnt);
            double elapseTime = StopWatch.elapseTime();
            double ratio = preTime == -1 ? 0 : elapseTime/preTime;
            System.out.println(ratio);
            preTime = elapseTime;
            N *= 2;
        }
    }
}
