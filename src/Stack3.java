
/**
 *
 * @author hill
 */
public class Stack3 {

    int[] buffer = null;
    int size = 0;
    int[] stackpt = {-1, -1, -1};

    public Stack3(int size) {
        this.size = size;
        this.buffer = new int[this.size * 3];
    }

    boolean push(int stackNum, int value) {
        if (stackpt[stackNum] > size - 2) {
            return false;
        }
        int index = stackNum * this.size + stackpt[stackNum] + 1;
        stackpt[stackNum]++;
        buffer[index] = value;
        return true;
    }

    int pop(int stackNum) {
        if (this.stackpt[stackNum] < 0) {
            return Integer.MIN_VALUE;
        }
        int index = stackNum * this.size + stackpt[stackNum];
        stackpt[stackNum]--;
        int val = buffer[index];
        buffer[index] = 0;
        return val;
    }

    int peek(int stackNum) {
        if (this.stackpt[stackNum] < 0) {
            return Integer.MIN_VALUE;
        }
        int index = stackNum * this.size + stackpt[stackNum];
        return buffer[index];
    }

    boolean isEmpty(int stackNum) {
        return stackpt[stackNum] == -1;
    }
}
