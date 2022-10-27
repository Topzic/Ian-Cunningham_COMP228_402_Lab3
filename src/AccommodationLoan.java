import java.util.ArrayList;
import java.util.Arrays;

public class AccommodationLoan extends Loan {

    private static int maxAmount = 6000;
    private double fixedRate = 4.3;
    private static ArrayList<Integer> termOptions = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

    public AccommodationLoan (String name, int term, double amount, LoanType loanType) {
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
