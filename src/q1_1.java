/**
 *
 * @author hill
 */
public class q1_1 {

    public q1_1() {
    }

    public boolean isUniqueChars(String str) {
        boolean[] unichar = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (unichar[val]) {
                return false;
            } else {
                unichar[val] = true;
            }
        }
        return true;
    }

    public boolean isUniqueChars2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            } else {
                checker |= (1 << val);
            }
        }
        return true;
    }
}
