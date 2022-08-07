package basicprac.codewithmosh;

public class Mortgage {
    private final static byte Months_In_Year = 12;
    private final static byte PERCENT = 100;
    //encapsulatiom
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double CalculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        short numberOfpayments = getNumberOfpayments();
        double balance = principal * (Math.pow(1 + monthlyInterest, numberOfpayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfpayments) - 1);
        return balance;
    }


    public double CalculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        short numberOfpayments = getNumberOfpayments();
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfpayments)) /
                (Math.pow(1 + monthlyInterest, numberOfpayments));

//        String mortgageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage : " + mortgageformatted);
        return mortgage;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfpayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = CalculateBalance(month);

        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / Months_In_Year;
    }

    private short getNumberOfpayments() {
        return (short) (years * Months_In_Year);
    }

//    public byte getYears() {
//        return years;
//    }
}
