package lint_code.array;

import java.util.Arrays;

/**
 * @author wjianwu 2019/6/10 16:06
 */
public class Depress {

    private static String depress(int m, int k, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (k <= 0 && m >= 0) {
                return "yes";
            }
            if (k > 0 && m < 0) {
                return "no";
            }
            if (m > arr[i]) {
                m -= arr[i];
                k -= 1;
            }
        }
        return "no";
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        System.out.println(depress(7, 3, arr));
    }
}
