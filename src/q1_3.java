/**
 *
 * @author hill
 */
public class q1_3 {

    public q1_3() {
    }

    public static char[] removeDuplicates(char[] strTmp) {
        char[] str = strTmp;
        if (str == null) {
            return null;
        }

        int len = str.length;

        if (len < 2) {
            return str;
        }
        for (int i = 0; i < len; i++) {
            if (str[i] != '*') {
                for (int j = i + 1; j < len; j++) {
                    if (str[j] == str[i]) {
                        str[j] = '*';
                    }
                }
            }
        }
        return str;
    }
}
