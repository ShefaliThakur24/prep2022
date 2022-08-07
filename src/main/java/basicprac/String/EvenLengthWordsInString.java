package basicprac.String;

public class EvenLengthWordsInString {
    public static void main(String[] args) {
        String str="I am married to Deepesh Maheshwari and we have one daughter named Omayra";
                for(String s :str.split(" ")){
                    if(s.length()%2==0){
                        System.out.println(s);
                    }
                }
    }
}
