package lint_code;

/**
 * @author wjianwu 2019/6/10 16:54
 */
public class InsertNode {

    private static ListNode insertNode(ListNode head, int val) {
        if (head == null) {
            return new ListNode(val);
        }
        while (head.next != null) {
            if (head.val < val && head.next.val > val) {
                ListNode listNode = new ListNode(val);
                listNode.next = head.next;
                head.next = listNode;
                break;
            }
            head = head.next;
            System.out.println();
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
