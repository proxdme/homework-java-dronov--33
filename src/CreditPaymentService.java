public class CreditPaymentService {
    public int calculate(int loanAmount, int numberPayments, double interestRate) {
        double annuityRate;
        int monthPays;
        double intRateMonth;
        intRateMonth = (interestRate /100) / 12;
        double a = (1 + intRateMonth);
        double e = numberPayments;
        double result = Math.pow(a,e);
        annuityRate = (intRateMonth * result) / (result - 1);
        monthPays = (int) (loanAmount * annuityRate);
        return monthPays;
    }
}



