package basicprac.codewithmosh;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private Mortgage calculator;

    public MortgageReport(Mortgage calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public  void diaplayMortgage() {
        double CalculatedMortgage = calculator.CalculateMortgage();
        String mortgageformatted = currency.format(CalculatedMortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------------");
        System.out.println("Monthly Payments : " + mortgageformatted);
    }

    public  void diaplayPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------");
        for(double balance :calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
        }
    }

