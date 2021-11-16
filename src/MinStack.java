import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinStack {

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-1);

        System.out.println(ms.getMin());
        System.out.println(ms.top());
        ms.pop();
        System.out.println(ms.getMin());
    }

    private final List<Integer> array = new ArrayList<>();
    private final PriorityQueue<Integer> minQ = new PriorityQueue<>();

    public MinStack() {
    }

    public void push(int val) {
        array.add(val);
        minQ.add(val);
    }

    public void pop() {
        final Integer integer = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        minQ.remove(integer);
    }

    public int top() {
        return array.get(array.size() - 1);
    }

    public int getMin() {
        return minQ.element();
    }

}
