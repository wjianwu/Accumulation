package lint_code;

import java.util.Arrays;

/**
 * @author wjianwu 2019/6/5 11:29
 */
public class Deduplication {

    private static int deduplication(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        }
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!flag) {
                    count += 1;
                }
                flag = true;
            } else {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 12, 23, 12, 45, 4, 2, 7, 6, 5, 5, 4, 1, 4, 2};
        System.out.println(deduplication(arr));
    }
}
