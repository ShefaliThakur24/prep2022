package revision.string;

public class RotatedString {

    public static boolean isRotated(String string, String rotatedString) {
        if (string.length() == 0 || rotatedString.length() == 0 || string.length() != rotatedString.length()) {
            return false;
        } else if (string == null || rotatedString == null) {
            return false;
        }
        String concatenated = string + string;
        return concatenated.contains(rotatedString);


    }

    public static void main(String[] args) {
        System.out.println(isRotated("abcd", "bcda"));
    }
}
