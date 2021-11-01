import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]"));
        System.out.println(new ValidParentheses().isValid("([)]"));
        System.out.println(new ValidParentheses().isValid("{[]}"));
        System.out.println(new ValidParentheses().isValid("(){}}{"));
    }

    public boolean isValid(String s) {
        Deque<Character> q = new LinkedList<>();
        final char[] chars = s.toCharArray();
        if (chars.length == 0)
            return true;
        if (chars.length == 1)
            return false;

        q.add(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ')' && !q.isEmpty() && q.getLast() == '(')
                q.removeLast();
            else if (chars[i] == '}' && !q.isEmpty() && q.getLast() == '{')
                q.removeLast();
            else if (chars[i] == ']' && !q.isEmpty() && q.getLast() == '[')
                q.removeLast();
            else
                q.add(chars[i]);
        }

        return q.isEmpty();
    }

}
