/**
 *
 * @author hill
 */
public class q1_8 {

    public q1_8() {
    }

    public static boolean isRotation(String a, String b) {
        if (a == null || b == null) {
            return false;
        }

        if (a.length() != b.length() || a.length() == 0 || b.length() == 0) {
            return false;
        }

        a = a.concat(a);

        // contains <-> isSubstring
        return a.contains(b);
    }
}
