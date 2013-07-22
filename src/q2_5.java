/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class q2_5 {

    public q2_5() {
    }

    public static void main(String args[]) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode cyclestart = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(4);
        LinkedListNode node5 = new LinkedListNode(5);
        LinkedListNode node6 = new LinkedListNode(6);
        LinkedListNode tail = new LinkedListNode(7);

        head.next = node1;
        node1.next = cyclestart;
        cyclestart.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = tail;
        tail.next = cyclestart;

        //output cyclestart, the data is 2.
        System.out.println(findStart(head).data);

    }

    public static LinkedListNode findStart(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
