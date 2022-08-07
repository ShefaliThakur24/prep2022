package revision.string;

public class PrintEvenNumberWithoutLoop {

    public static void printNos(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n + "");
        printNos(n - 2);
    }

    public static void main(String[] args) {
        int n = 97;

        // Even
        if (n % 2 == 0) {
            printNos(n);
        } else {
            printNos(n - 1);
        }

    }
}
