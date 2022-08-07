package revision.string;

public class ReverseEachWordInString {
    public static void main(String[] args) {

        String str = "Welcome to Java World";
        StringBuilder sb = new StringBuilder();
        String strArray[] = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            sb.append(strArray[i] +" ");

        }
        System.out.println(sb);
    }
}
