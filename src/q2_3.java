/**
 *
 * @author hill
 */
public class q2_3 {

    public q2_3() {
    }

    public static void main(String args[]) {
        LinkedListNode head = null;
        LinkedListNode tmp = null;
        int a[] = {1, 2, 1};
        for (int i = 0; i < a.length; i++) {
            LinkedListNode next = new LinkedListNode(a[i]);
            if (i == 0) {
                head = tmp = next;
                continue;
            }
            tmp.next = next;
            tmp = next;
        }

        // Print the list(before) 
        tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        };

        LinkedListNode mid = head.next;

        delMidNode(mid); // Print the list(before) 

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        };
    }

    public static boolean delMidNode(LinkedListNode mid) {
        if (mid == null || mid.next == null) {
            return false;
        }
        LinkedListNode midNext = mid.next;
        mid.data = midNext.data;
        mid.next = midNext.next;
        return true;
    }
}
