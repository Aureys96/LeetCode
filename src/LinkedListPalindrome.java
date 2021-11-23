import helpers.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static helpers.ListNode.createList;

public class LinkedListPalindrome {

    public static void main(String[] args) {
        System.out.println(new LinkedListPalindrome().isPalindrome(createList(new int[] {0, 0})));
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode finish = head;
        Deque<Integer> q = new LinkedList<>();
        while (finish != null) {
            if ((Integer)finish.val == q.peekFirst())
                q.pop();
            else
                q.push(finish.val);
            finish = finish.next;
        }
        return q.isEmpty();
    }
}
