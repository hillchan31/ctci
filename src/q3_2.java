
/**
 *
 * @author hill
 */
public class q3_2 {

    public q3_2() {
    }

    public static void main(String args[]) {
        StackMin2 stackm = new StackMin2();
        System.out.println(stackm.isEmpty());
        System.out.println(stackm.min());
        stackm.push(2);
        System.out.println(stackm.min());
        stackm.push(1);
        System.out.println(stackm.min());
        stackm.pop();
        System.out.println(stackm.min());
    }
}
