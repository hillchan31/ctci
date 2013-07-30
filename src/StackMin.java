
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

 /**
 *
 * @author hill
 */
public class StackMin extends Stack<NodeMin> {

    public StackMin() {
    }

    public void push(int value) {
        int min = Math.min(value, min());
        super.push(new NodeMin(value, min));
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return super.peek().min;
        }
    }
}
