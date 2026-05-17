public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        cur.next = head;
        while (cur.next != null && cur.next.next != null) {
            ListNode a = cur.next, b = cur.next.next;
            a.next = b.next;
            b.next = a;
            cur.next = b;
            cur = cur.next.next;
        }

        return dummy.next;
    }

}
