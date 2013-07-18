import java.lang.reflect.Array;
import java.math.BigDecimal;

/**
 *
 * @author hill
 */
public class Test {

    public static int desc(int a) {
        a--;
        return a;
    }

    public static void main(String args[]) {
        System.out.println("Hello World");

        System.out.println(desc(9));

        for (int i = 0; i < 3; ++i) {
            System.out.println(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }


        int[][] test = new int[2][4];
        System.out.println(test.length);
        System.out.println(test[0].length);


//        String st = "test";
//        System.out.println(st);
//
//        String st1 = new String("test1");
//        System.out.println(st1);
//
//        double a = 1.1;
//        double b = 2.2;
//        double c = 3.3;
//
//        if (a + b > c) {
//            System.out.println("a+b>c");
//        } else {
//            System.out.println("a+b<=c");
//        }
//
//        BigDecimal aBig = new BigDecimal(a);
//        BigDecimal bBig = new BigDecimal(b);
//        BigDecimal cBig = new BigDecimal(c);
//
//        System.out.println(aBig.add(bBig).compareTo(cBig) );
//
//        if (aBig.add(bBig).compareTo(cBig) > 0) {
//            System.out.println("aBig+bBig>cBig");
//        } else {
//            System.out.println("aBig+bBig<=cBig");
//        }
//        
//        int intarr[] = new int[3];
//        
//        

    }
}
