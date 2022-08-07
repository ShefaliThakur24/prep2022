package basicprac.String;

public class CountNoOfWords {
    public static void main(String[] args) {
        String str = "Java  Programming  Question";
        System.out.println(str.split("\\s+ ").length);
        System.out.println(countWords(str));
        //The Java regex pattern \\s+ is used to match multiple
        // //whitespace characters when applying a regex search to your specified value.
    }

    private static int countWords(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        return wordCount;
    }
}
