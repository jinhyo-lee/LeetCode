public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode m = middle(head), r = reverse(m), l = head;
        m.next = null;

        while (l != null && r != null) {
            if (l.val != r.val) return false;
            l = l.next;
            r = r.next;
        }

        return true;
    }

    private ListNode middle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
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
