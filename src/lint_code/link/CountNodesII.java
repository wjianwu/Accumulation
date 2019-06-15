package lint_code.link;

/**
 * @author wjianwu 2019/6/11 11:03
 */
public class CountNodesII {

    public int countNodesII(ListNode head) {
        int count = 0;
        while (head != null) {
            if (head.val > 0 && head.val % 2 != 0) {
                count += 1;
            }
            head = head.next;
        }
        return count;
    }
}
