package basicprac.String;

public class ReverseEachWordOfString {

    //using two pointer apporach for time complexity as 0n and space complexity as o1

    public static void main(String[] args) {
        String str = "Java Programming";
//using split
        String[] words = str.split(" ");
        String revString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }
            revString=revString+revWord;
        }
        System.out.println(revString);
    }
}
