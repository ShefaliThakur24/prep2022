package basicprac.String;
//On is the complexity
import java.util.Set;

public class VowelsAndConsonants {
    public static String removeVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (!vowels.contains(c))
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("ice cream"));
    }
}
