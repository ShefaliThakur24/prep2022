package basicprac.String;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str="Welcome to Java World";
       String s[]= str.split(" ");
       for(int i=s.length-1;i>=0;i--){
           System.out.println(s[i]);
       }
    }
}
