/**
 *
 * @author hill
 */
public class q2_2 {

    public q2_2() {
    }

    public static void main(String args[]) {
        LinkedListNode head = null;
        LinkedListNode tmp = null;
        int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < a.length; i++) {
            LinkedListNode next = new LinkedListNode(a[i]);
            if (i == 0) {
                head = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }

        LinkedListNode lastNNode = null;
        lastNNode = lastNth(head, 11);
        if (lastNNode != null) {
            System.out.println(lastNNode.data);
        }

        lastNNode = lastNth(head, 2);
        if (lastNNode != null) {
            System.out.println(lastNNode.data);
        }
    }

    public static LinkedListNode lastNth(LinkedListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        LinkedListNode first = head;
        LinkedListNode second = head;
        while (n > 1) {
            if (second == null) {
                // n is more than the length of the linked list
                return null;
            }
            second = second.next;
            n--;
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        return first;
    }
}
