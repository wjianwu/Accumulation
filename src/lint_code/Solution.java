package lint_code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/4 11:10
 */
public class Solution {

    private static List<Integer> getNarcissisticNumbers(int n) {
        if (n < 1 || n > 8) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        int start = n == 1 ? 0 : (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n) - 1;
        for (int i = start; i <= end; i++) {
            int oldI = i;
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += cal((oldI % 10), n);
                oldI = (oldI - (oldI % 10)) / 10;
            }
            if (sum == i) {
                list.add(sum);
            }
        }
        return list;
    }

    private static int cal(int ori, int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= ori;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getNarcissisticNumbers(1));
    }
}
