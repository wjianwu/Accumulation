package sort_algorithm;

import java.util.Arrays;

/**
 * @author wjianwu 2019/3/27 14:30
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = position(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int position(int[] arr, int left, int right) {
        int base = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= base) {
                right--;
            }
            swap(arr, left, right);
            while (left < right && arr[left] <= base) {
                left++;
            }
            swap(arr, left, right);
        }
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
