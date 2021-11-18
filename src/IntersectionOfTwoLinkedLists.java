import helpers.ListNode;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public ListNode getIntersectionNodeSlow(ListNode headA, ListNode headB) {
        Set<String> nodes = new LinkedHashSet<>();

        while (headB != null) {
            nodes.add(headB.toString());
            headB = headB.next;
        }

        while (headA != null) {
            if (nodes.contains(headA.toString())) {
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }
}
