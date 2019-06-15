package lint_code.array;

/**
 * @author wjianwu 2019/6/5 15:53
 */
public class SearchInsert {
    public int searchInsert(int[] A, int target) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == target) {
                return i;
            }
            if (A[i] > target) {
                return i;
            }
            i++;
        }
        return A.length;
    }
}
