package helpers;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createList(int[] ints) {
        if (ints.length == 0)
            return null;
        ListNode start = new ListNode(ints[0]);
        ListNode prev = start;
        for (int i = 1; i < ints.length; i++) {
            prev.next = new ListNode(ints[i]);
            prev = prev.next;
        }

        return start;
    }
}
