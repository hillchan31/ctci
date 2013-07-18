import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hill
 */
public class q2_2Test {

    public q2_2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of lastNth method, of class q2_2.
     */
    @Test
    public void testLastNth() {
        System.out.println("lastNth");
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
        assertEquals(null, q2_2.lastNth(head, 0));
        assertEquals(null, q2_2.lastNth(head, 11));
        assertEquals(1, q2_2.lastNth(head, 1).data);
        assertEquals(8, q2_2.lastNth(head, 8).data);
        assertEquals(null, q2_2.lastNth(null, 8));
    }
}