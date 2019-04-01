package sort_algorithm;

import java.util.Arrays;

/**
 * @author wjianwu 2019/3/27 16:09
 * 希尔排序
 */
public class XRSort {

    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        xrSort(arr);
    }

    private static void xrSort(int[] arr) {
        int inc = arr.length / 2;
        while (inc > 0) {
            for (int i = inc; i < arr.length; i++) {
                while (i >= inc && arr[i - inc] > arr[i]) {
                    int temp = arr[i - inc];
                    arr[i - inc] = arr[i];
                    arr[i] = temp;
                    i -= inc;
                }
            }
            inc /= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
