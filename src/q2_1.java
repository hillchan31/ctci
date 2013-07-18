import java.util.Hashtable;
/**
 *
 * @author hill
 */
public class q2_1 {

    public q2_1() {
    }

    public static void main(String args[]) {
        
        LinkedListNode head = null;
        LinkedListNode tmp = null;
        int a[] = {1, 2, 3, 3, 2, 1, 4};
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

        delDup1(head);

        // Print the list(before) 

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        };
    }

    public static void delDup1(LinkedListNode head) {
        LinkedListNode n = head;
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        LinkedListNode previous = null;
        while (n != null) {
            if (table.containsKey(new Integer(n.data))) {
                previous.next = n.next;
            } else {
                table.put(new Integer(n.data), new Integer(1));
                previous = n;
            }
            n = n.next;
        }
    }

    public static void delDup(LinkedListNode head) {
        if (head == null) {
            return;
        }

        LinkedListNode runner = head;
        LinkedListNode runnernext = head;
        LinkedListNode current = head;

        while (current != null) {
            runner = current;
            runnernext = current.next;
            int currentData = current.data;
            while (runnernext != null) {
                if (runnernext.data == currentData) {
                    runner.next = runnernext.next;
                    runnernext = runner.next;
                } else {
                    runner = runnernext;
                    runnernext = runner.next;
                }
            }
            current = current.next;
        }
    }
}
