package basicprac.String;

public class LengthOfStringWithoutLengthFunction {
    public static void main(String[] args) {
        String str = "testing";
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));
        System.out.println(str.split("").length);
        int l = new StringBuilder(str).length();
        System.out.println(l);

        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println(count);
        System.out.println(getalength(str));
    }

    //through not built in functions
    public static int getalength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }

        } catch (IndexOutOfBoundsException e) {
            return i;
        }


    }
}

