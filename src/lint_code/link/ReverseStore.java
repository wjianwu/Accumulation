package lint_code.link;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/10 17:37
 */
public class ReverseStore {

    public List<Integer> reverseStore(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode listNode = head;
        int count = 0;
        while (head != null) {
            list.add(head.val);
            count += 1;
            head = head.next;
        }
        while (listNode != null) {
            list.set(count - 1, listNode.val);
            listNode = listNode.next;
            count -= 1;
        }
        return list;
    }
}
