import java.util.ArrayList;
import java.util.Arrays;

public class ComputerLoan extends Loan {

    private static int maxAmount = 1000;
    private double fixedRate = 0;
    private static ArrayList<Integer> termOptions = new ArrayList<Integer>(Arrays.asList(1, 2));

    public ComputerLoan (String name, int term, double amount, LoanType loanType) {
        super.setBorrowerName(name);
        super.setLoanTerm(term);
        super.setLoanAmount(amount);
        super.setInterestRate(fixedRate);
        super.setLoanType(loanType);
    }

    public static boolean loanRequirements(double amount, int term) {
        if (amount < maxAmount && termOptions.contains(term)) {
            return true;
        }
        System.out.println("Computer loan does not meet requirements.");
        return false;
    }
}
