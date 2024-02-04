//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        double interestRate = 9.99; // в процентах
        int numberPayments = 24;
        int monthlyPayment = service.calculate(loanAmount, numberPayments, interestRate);
        System.out.println();
        System.out.println("Monthly Payment= " + monthlyPayment);
        System.out.println(interestRate);
        System.out.println(numberPayments);
    }
    }
