
import java.util.Stack;

/**
 *
 * @author hill
 */
public class StackMin2 extends Stack<Integer> {

    Stack<Integer> mins;

    public StackMin2() {
        mins = new Stack<>();
    }

    public void push(int value) {
        if (value <= min()) {
            mins.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            mins.pop();
        }
        return value;
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return this.mins.peek();
        }
    }
}
