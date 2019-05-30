package lhh.easy;

import java.util.*;

/**
 * @author lhh
 * @date 2019/5/30 22:50
 */
public class 找零钱01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        List<int[]> ints = twoSum(a, 6);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }

    public static List<int[]> twoSum(int[] a, int target){
        Map<Integer,Integer> map = new HashMap<>();
        List<int[]> ints = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target - a[i])){
                int[] result = new int[2];
                result[0] = map.get(target - a[i]);
                result[1] = i;
                ints.add(result);
            }
            map.put(a[i], i);
        }
        return ints;
    }
}
