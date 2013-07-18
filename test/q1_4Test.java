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
public class q1_4Test {

    public q1_4Test() {
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
     * Test of isAnagram method, of class q1_4.
     */
    @Test
    public void testIsAnagram() {
        System.out.println("isAnagram");
        assertEquals(true, q1_4.isAnagram("abc", "cba"));
        assertEquals(true, q1_4.isAnagram("abc", "abc"));
        assertEquals(false, q1_4.isAnagram("abc", "abca"));
        assertEquals(false, q1_4.isAnagram(null, null));
        assertEquals(true, q1_4.isAnagram("abc                 123", "123   abc"));
        assertEquals(true, q1_4.isAnagram("   1 ", "1"));
    }

    /**
     * Test of isAnagram2 method, of class q1_4.
     */
    @Test
    public void testIsAnagram2() {
        System.out.println("isAnagram2");
        assertEquals(true, q1_4.isAnagram2("abc", "cba"));
        assertEquals(true, q1_4.isAnagram2("abc", "abc"));
        assertEquals(false, q1_4.isAnagram2("abc", "abca"));
        assertEquals(false, q1_4.isAnagram2(null, null));
        assertEquals(true, q1_4.isAnagram2("abc                 123", "123   abc"));
        assertEquals(true, q1_4.isAnagram2("   1 ", "1"));
        assertEquals(false, q1_4.isAnagram2("aaaaaaaaaaaaaaaaa", "aaaaaaa"));
        assertEquals(true, q1_4.isAnagram2("aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa"));
    }
}