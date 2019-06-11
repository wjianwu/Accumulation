package lint_code;

/**
 * @author wjianwu 2019/6/10 16:54
 */
public class InsertNode {

    private static ListNode insertNode(ListNode head, int val) {
        if (head == null) {
            return new ListNode(val);
        }
        if (head.val > val) {
            ListNode listNode = new ListNode(val);
            listNode.next = head;
            return listNode;
        }
        ListNode listNode = head;
        while (head.next != null) {
            if (head.val <= val && val < head.next.val) {
                ListNode temp = new ListNode(val);
                temp.next = head.next;
                head.next = temp;
                return listNode;
            }
            head = head.next;
        }
        head.next = new ListNode(val);
        return listNode;
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
