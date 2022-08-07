package basicprac.String;

public class AnagramByKrishna {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "avaj";
        System.out.println(anagramCheck(str1,str2));
    }

    public static boolean anagramCheck(String str, String str2) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder(str2);
        for (char c : ch) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.deleteCharAt(index);
            } else
                return false;
        }
        return sb.length() == 0;
    }
}
