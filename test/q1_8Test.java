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
public class q1_8Test {

    public q1_8Test() {
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
     * Test of isRotation method, of class q1_8.
     */
    @Test
    public void testIsRotation() {
        System.out.println("isRotation");
        assertEquals(false, q1_8.isRotation(null, null));
        assertEquals(false, q1_8.isRotation("abc", null));
        assertEquals(false, q1_8.isRotation(null, "abc"));
        assertEquals(true, q1_8.isRotation("abc", "abc"));
        assertEquals(false, q1_8.isRotation("abcd", "abc"));
        assertEquals(true, q1_8.isRotation("abc", "cab"));
        assertEquals(true, q1_8.isRotation("abc", "bca"));
        assertEquals(false, q1_8.isRotation("abc", "bac"));
        assertEquals(false, q1_8.isRotation("", ""));
        assertEquals(true, q1_8.isRotation("javanetbeans", "tbeansjavane"));
    }
}