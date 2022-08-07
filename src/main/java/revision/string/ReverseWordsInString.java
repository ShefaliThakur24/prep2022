package revision.string;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String st = "Her name is Monica";
        String words[] = st.split(" ");
        String firstWord = words[0];

        String revString="";

        for(int i=1;i<words.length;i++){
           String word= words[i];
           String revWord="";
           for(int j=word.length()-1;j>=0;j--){
               revWord=revWord+word.charAt(j);
           }
           revString=revString + revWord;
        }

        System.out.println(firstWord+ " " +revString);
    }
}
