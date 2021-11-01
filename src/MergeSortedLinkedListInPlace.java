public class MergeSortedLinkedListInPlace {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode start;
        ListNode first;
        ListNode second;

        if (l1.val > l2.val) {
            start = l2;
            first = l1;
            second = l2.next;
        } else {
            start = l1;
            first = l1.next;
            second = l2;
        }

        ListNode current = start;

        while (true) {

            if (first == null) {
                current.next = second;
                break;
            } else if (second == null) {
                current.next = first;
                break;
            }

            if (first.val > second.val) {
                current.next = second;
                current = current.next;
                second = second.next;
            } else {
                current.next = first;
                current = current.next;
                first = first.next;
            }

        }

        return start;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
