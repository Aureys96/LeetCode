import helpers.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null || head.next.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (slow.next != null && fast.next != null && fast.next.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

}
