package revision.string;

public class SpecialCharacterStringReversal {
    public static void reverse(char[] ch) {

        int low = 0;
        int high = ch.length - 1;

        while (low < high) {
            if (!Character.isAlphabetic(ch[low])) {
                low++;
            } else if (!Character.isAlphabetic(ch[high])) {
                high--;
            } else {
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }

    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] ch = str.toCharArray();
        reverse(ch);
        String rev = new String(ch);
        System.out.println(rev);
    }
}
