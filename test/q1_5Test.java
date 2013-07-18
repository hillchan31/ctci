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
public class q1_5Test {

    public q1_5Test() {
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
     * Test of replaceSpace method, of class q1_5.
     */
    @Test
    public void testReplaceSpace() {
        System.out.println("replaceSpace");
        assertEquals("", q1_5.replaceSpace(""));
        assertEquals(null, q1_5.replaceSpace(null));
        assertEquals("%20", q1_5.replaceSpace(" "));
        assertEquals("Dublin%20Ireland", q1_5.replaceSpace("Dublin Ireland"));
        assertEquals("%20a%20a%20", q1_5.replaceSpace(" a a "));
        assertEquals("%20a%20%20", q1_5.replaceSpace(" a  "));
        assertEquals("%%202%200", q1_5.replaceSpace("% 2 0"));
    }
}