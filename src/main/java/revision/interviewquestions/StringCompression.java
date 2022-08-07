package revision.interviewquestions;

//return length of the compressed string
public class StringCompression {

    public static int compress(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            if (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String str = j - i + "";
                for (char c : str.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }

    public static void main(String[] args) {
        String s = "abbbbbbbbbb";
        int strLen = compress(s);
        System.out.println(strLen);

    }
}
