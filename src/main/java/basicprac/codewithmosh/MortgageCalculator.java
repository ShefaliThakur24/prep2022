package basicprac.codewithmosh;

public class MortgageCalculator {

    public static void main(String[] args) {


        int principal = (int) Console.readNumber("principle", 1000, 100000);
        float annualInterest = (float) Console.readNumber("annualInterest", 1, 30);
        byte years = (byte) Console.readNumber("years", 1, 30);


//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfpayments)) /
//                (Math.pow(1 + monthlyInterest, numberOfpayments));
//        method chaining
//         getCurreny is a static factory method
//         which create new object
        var Calculator = new Mortgage(principal, annualInterest, years);
        var result = new MortgageReport(Calculator);
        result.diaplayMortgage();

        result.diaplayPaymentSchedule();
    }

}
