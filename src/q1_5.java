/**
 *
 * @author hill
 */
public class q1_5 {

    public q1_5() {
    }

    public static String replaceSpace(String a) {
        if (a == null) {
            return null;
        }
        if (a.equals("")) {
            return "";
        }
        char[] aArr = a.toCharArray();
        int count = 0;
        for (char c : aArr) {
            if (c == ' ') {
                count++;
            }
        }

        char[] bArr = new char[aArr.length + 2 * count];
        int i = 0;
        for (char c : aArr) {
            if (c == ' ') {
                bArr[i++] = '%';
                bArr[i++] = '2';
                bArr[i++] = '0';
            } else {
                bArr[i++] = c;
            }
        }
        return String.valueOf(bArr);
    }
}
