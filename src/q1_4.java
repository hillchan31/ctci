/**
 *
 * @author hill
 */
public class q1_4 {

    public q1_4() {
    }

    private static String sort(String b) {
        char[] strArr = b.toCharArray();
        int len = strArr.length;
        char tmp;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (strArr[j] > strArr[j - 1]) {
                    tmp = strArr[j];
                    strArr[j] = strArr[j - 1];
                    strArr[j - 1] = tmp;
                }
            }
        }
        return String.valueOf(strArr);
    }

    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        String aR = a.replaceAll(" ", "");
        String bR = b.replaceAll(" ", "");

        return sort(aR).equals(sort(bR));
    }

    public static boolean isAnagram2(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        String aR = a.replaceAll(" ", "");
        String bR = b.replaceAll(" ", "");

        char[] aArr = aR.toCharArray();
        char[] bArr = bR.toCharArray();
        int[] flag = new int[256];

        for (char c : aArr) {
            flag[c]++;
        }

        for (char c : bArr) {
            flag[c]--;
        }

        for (int i : flag) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
