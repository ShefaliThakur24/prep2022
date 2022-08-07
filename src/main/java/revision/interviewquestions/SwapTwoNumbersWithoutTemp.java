package revision.interviewquestions;

public class SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        int i = 15;
        int j = 10;


        j=j-i;
        i=i+j;
        j=i-j;

        System.out.println(i);
        System.out.println(j);
    }
}
