/**
 *
 * @author hill
 */
public class q2_4 {

    public q2_4() {
    }

    public static void main(String args[]) {
        LinkedListNode aNode = null;
        LinkedListNode bNode = null;
        LinkedListNode tmp = null;
        // a = 815
        int a[] = {5, 1, 8,};
        // b = 3186
        int b[] = {6, 8, 1, 3};

        for (int i = 0; i < a.length; i++) {
            LinkedListNode next = new LinkedListNode(a[i]);
            if (i == 0) {
                aNode = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }

        for (int i = 0; i < b.length; i++) {
            LinkedListNode next = new LinkedListNode(b[i]);
            if (i == 0) {
                bNode = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }

        printList(aNode);
        printList(bNode);

//        // Print the list(before) 
//        tmp = aNode;
//        while (tmp != null) {
//            System.out.println(tmp.data);
//            tmp = tmp.next;
//        };
//
//        tmp = bNode;
//        while (tmp != null) {
//            System.out.println(tmp.data);
//            tmp = tmp.next;
//        };
    }

    public static void printList(LinkedListNode a) {
        LinkedListNode tmp = a;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        };
    }

    public final static void arrToList(int[] arr, LinkedListNode node) {
        LinkedListNode tmp = null;
        for (int i = 0; i < arr.length; i++) {
            LinkedListNode next = new LinkedListNode(arr[i]);
            if (i == 0) {
                node = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }
    }

    public static LinkedListNode add(LinkedListNode a, LinkedListNode b, int carry) {

        return null;
    }
}
