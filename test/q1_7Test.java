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
public class q1_7Test {

    public q1_7Test() {
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
     * Test of setZero method, of class q1_7.
     */
    @Test
    public void testSetZero() {
        System.out.println("setZero");
        int[][] test = null;
        int[][] expected = null;
        assertArrayEquals(expected, q1_7.setZero(test));
        int[][] test1 = {};
        int[][] expected1 = {};
        assertArrayEquals(expected1, q1_7.setZero(test1));
        int[][] test2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected2 = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        assertArrayEquals(expected2, q1_7.setZero(test2));
        int[][] test3 = {{1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}};
        int[][] expected3 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}};
        assertArrayEquals(expected3, q1_7.setZero(test3));
    }
}