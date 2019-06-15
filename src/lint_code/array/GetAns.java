package lint_code.array;

import java.util.Arrays;

/**
 * @author wjianwu 2019/6/10 15:59
 */
public class GetAns {

    private static int getAns(int[] a) {
        int index = a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1;
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(a);
        int temp = a[index - 1];
        for (int i = 0; i < b.length; i++) {
            if (b[i] == temp) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(getAns(arr));
    }

}
