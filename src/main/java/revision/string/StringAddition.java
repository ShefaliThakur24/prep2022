package revision.string;

public class StringAddition {
    public static void main(String[] args) {
        String s = "abc123fhf12djsh12234bjdsbhds98nbd0sbds0bs1dhjjs3jh8jshds7nahs9876hdh9n4";
        System.out.println(findSumValue(s));
    }

    private static int findSumValue(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int j = i + 1;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }

                String subString = s.substring(i, j);
                sum += Integer.parseInt(subString);
                i = j;
            }
            else {
                i++;
            }
        }

        return sum;
    }

    private static void findSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }

        }
        System.out.println(sum);
    }
}
