package lint_code.link;

/**
 * @author wjianwu 2019/6/10 17:49
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode listNode = head;
        while (head != null) {
            count += 1;
            head = head.next;
        }
        int temp = count % 2 == 0 ? count / 2 : count / 2 - 1;
        for (int i = 0; i < temp; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }
}
