/**
 *
 * @author hill
 */
public class q3_1 {
    
    public q3_1() {
    }
    
    public static void main(String args[]) {
        Stack3 stack = new Stack3(20);
        for (int i = 0; i < 20; i++) {
            stack.push(0, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop(0));
        }
        System.out.println(stack.pop(1));
        System.out.println(stack.isEmpty(2));
        System.out.println(stack.peek(0));
    }
}
