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
public class q1_6Test {

    public q1_6Test() {
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
     * Test of rotate method, of class q1_6.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int[][] test = {{1, 2}, {3, 4}};
        int[][] expected = {{3, 1}, {4, 2}};
        assertArrayEquals(expected, q1_6.rotate(test, 2));
        int[][] test1 = {{1}};
        int[][] expected1 = {{1}};
        assertArrayEquals(expected1, q1_6.rotate(test1, 1));
        int[][] test2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] expected2 = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertArrayEquals(expected2, q1_6.rotate(test2, 4));
        int[][] test3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected3 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(expected3, q1_6.rotate(test3, 3));
    }
}