package lint_code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wjianwu 2019/6/5 11:29
 */
public class Deduplication {

    private static int deduplication(int[] nums) {
        List<Integer> copy = new ArrayList<>();

        for (Integer num : nums) {
            if (!copy.contains(num)) {
                copy.add(num);
            }
        }
        for (int i = 0; i < copy.size(); i++) {
            nums[i] = copy.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return copy.size();
    }


    public static void main(String[] args) {
        int[] arr = {-3, 8, -3, -5, -8, 1, 4, -5, -6, -10, 2, 10, 9, 10, 5, -1, -6, 5, 1, -1, -4, 9, 0, 9, -4, -5, -4,
                8, 0, -3, 6, 8, 5, -8, -7, -6, -6, -1, 6, -3, -7, 2, -4, 1, 8, -1, 6, 0, -9, -8, -3, -10, 0, -5, -2,
                10, -6, -4, -1, 4, -3, -10, -8, 3, 7, 4, 10, -6, 4, -1, 7, -9, 7, 0, 5, 7, -5, -7, -6, -3};
        int[] arr1 = {1, 1, 2, 1};
        System.out.println(deduplication(arr1));
    }
}
