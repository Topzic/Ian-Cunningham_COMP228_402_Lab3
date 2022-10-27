import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Ian Cunningham
 * Date: 10/27/2022
 * File: TuitionLoan.java
 * Subclass of Loan
 */

public class TuitionLoan extends Loan {

    private static int maxAmount = 20000;
    private double fixedRate = 2.5;
    static ArrayList<Integer> termOptions = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));

    /** Parameterized Constructor */
    public TuitionLoan (String name, int term, double amount, LoanType loanType) {
        super.setBorrowerName(name);
        super.setLoanTerm(term);
        super.setLoanAmount(amount);
        super.setInterestRate(fixedRate);
        super.setLoanType(loanType);
    }

    /** Checks if requirements are met from user input */
    public static boolean loanRequirements(double amount, int term) {
        if (amount < maxAmount && termOptions.contains(term)) {
            return true;
        }
        System.out.println("Computer loan does not meet requirements.");
        return false;
    }

}
