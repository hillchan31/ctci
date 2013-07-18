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
public class q1_3Test {

    public q1_3Test() {
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
     * Test of removeDuplicates method, of class q1_3.
     */
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        assertArrayEquals("abcd".toCharArray(), q1_3.removeDuplicates("abcd".toCharArray()));
        assertArrayEquals(null, q1_3.removeDuplicates(null));
        assertArrayEquals("a****".toCharArray(), q1_3.removeDuplicates("aaaaa".toCharArray()));
        assertArrayEquals("a**b**".toCharArray(), q1_3.removeDuplicates("aaabbb".toCharArray()));
        assertArrayEquals("abcdefg*".toCharArray(), q1_3.removeDuplicates("abcdefga".toCharArray()));
        assertArrayEquals("abcdefg*".toCharArray(), q1_3.removeDuplicates("abcdefgb".toCharArray()));
    }
}