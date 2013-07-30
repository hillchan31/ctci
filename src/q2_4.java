/**
 *
 * @author hill
 */
public class q2_4 {

    public q2_4() {
    }

    public static void main(String args[]) {
        // a = 815
        int a[] = {5, 1, 8,};
        // b = 3186
        int b[] = {6, 8, 1, 3};
        LinkedListNode aNode = arrToList(a);
        LinkedListNode bNode = arrToList(b);

        //output aNode: 518
        printList(aNode);
        //output bNode 6813
        printList(bNode);

        LinkedListNode result = add(aNode, bNode, 0);

        //output result 1004
        printList(result);

    }

    public static void printList(LinkedListNode a) {
        LinkedListNode tmp = a;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        };
        System.out.println("");
    }

    public static LinkedListNode arrToList(int[] a) {
        LinkedListNode node = null;
        LinkedListNode tmp = null;
        for (int i = 0; i < a.length; i++) {
            LinkedListNode next = new LinkedListNode(a[i]);
            if (i == 0) {
                node = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }
        return node;
    }

    public static LinkedListNode add(LinkedListNode a, LinkedListNode b, int carry) {
        if (a == null && b == null) {
            return null;
        }

        LinkedListNode result = new LinkedListNode(carry);
        int value = carry;
        if (a != null) {
            value += a.data;
        }
        if (b != null) {
            value += b.data;
        }

        result.data = value % 10;

        LinkedListNode more = add(a == null ? null : a.next, b == null ? null : b.next, value > 9 ? 1 : 0);

        result.next = more;
        return result;
    }
}
