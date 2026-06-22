public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            head = cur.next;
            cur.next = prev;
            prev = cur;
            cur = head;
        }

        return prev;
    }

}
