import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {

    final private byte PERCENT = 100;
    final private byte MONTHS_IN_A_YEAR = 12;
    private int principal;
    private float monthlyInterest;
    private int numberOfPayments;
    private float annualInterest;
    private int years;

    public Calculator() {}

    Scanner scanner = new Scanner(System.in);

    public void inputPrincipal() {

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt(); //Principal input
            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
            System.out.println("Enter a number between $1K and $1M!");
        }
    }

    public void inputAnnualInterest() {

        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat(); //the value of "AIR" which need to be devided twice
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_A_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less or equal to 30");
        }
    }

    public void inputYears() {

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt(); //numbers of month, so *12 needed
            if (years > 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_A_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 1 and less or equal to 30");
        }
        scanner.close();
    }

    public void calculation() {

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))
                / ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1));
        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);
    }

    public byte getPERCENT() {
        return PERCENT;
    }

    public byte getMONTHS_IN_A_YEAR() {
        return MONTHS_IN_A_YEAR;
    }

    public int getPrincipal() {
        return principal;
    }

    public float getMonthlyInterest() {
        return monthlyInterest;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public int getYears() {
        return years;
    }
}
