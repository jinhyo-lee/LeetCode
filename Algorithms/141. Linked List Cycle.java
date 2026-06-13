public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

    /*public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        Set<ListNode> set = new HashSet<>();
        do if (!set.add(head)) return true; while ((head = head.next) != null);

        return false;
    }*/

}
