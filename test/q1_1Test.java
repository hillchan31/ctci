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
public class q1_1Test {

    public q1_1Test() {
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
     * Test of isUniqueChars method, of class q1_1.
     */
    @Test
    public void testIsUniqueChars() {
        System.out.println("isUniqueChars");
        q1_1 instance = new q1_1();

        assertEquals(true, instance.isUniqueChars("123"));
        assertEquals(false, instance.isUniqueChars("122"));
        assertEquals(true, instance.isUniqueChars(""));
        assertEquals(true, instance.isUniqueChars("1234567890qwertyuiop[]asdfghjkl;'zxcvbnm,./"));
        assertEquals(false, instance.isUniqueChars("1234567890qwertyuiop[]asdfghjkl;'zxcvbnm,./1"));
        assertEquals(false, instance.isUniqueChars("\"\""));
    }

    /**
     * Test of isUniqueChars2 method, of class q1_1.
     */
    @Test
    public void testIsUniqueChars2() {
        System.out.println("isUniqueChars");
        q1_1 instance = new q1_1();

        assertEquals(true, instance.isUniqueChars("123"));
        assertEquals(false, instance.isUniqueChars("122"));
        assertEquals(true, instance.isUniqueChars(""));
        assertEquals(true, instance.isUniqueChars("1234567890qwertyuiop[]asdfghjkl;'zxcvbnm,./"));
        assertEquals(false, instance.isUniqueChars("1234567890qwertyuiop[]asdfghjkl;'zxcvbnm,./1"));
        assertEquals(false, instance.isUniqueChars("\"\""));
    }
}