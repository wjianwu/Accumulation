package lint_code.array;

/**
 * @author wjianwu 2019/6/5 15:36
 */
public class MultiSort {

    public int[][] multiSort(int[][] arr) {
        int k;
        for (int i = 0; i < arr.length; i++) {
            k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][1] > arr[k][1]) {
                    k = j;
                }
                if (arr[j][1] == arr[k][1]) {
                    if (arr[j][0] < arr[k][0]) {
                        k = j;
                    }
                }
            }
            if (k != i) {
                int temp = arr[k][0];
                arr[k][0] = arr[i][0];
                arr[i][0] = temp;
                int temp1 = arr[k][1];
                arr[k][1] = arr[i][1];
                arr[i][1] = temp1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
