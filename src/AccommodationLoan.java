import java.util.ArrayList;
import java.util.Arrays;

public class AccommodationLoan extends Loan {

    private int maxAmount = 6000;
    private double fixedRate = 4.3;
    ArrayList<Integer> termOptions = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

    public AccommodationLoan (String name, int term, double amount, LoanType loanType) {
        super.setBorrowerName(name);
        super.setLoanTerm(term);
        super.setLoanAmount(amount);
        super.setInterestRate(fixedRate);
        super.setLoanType(loanType);
    }

    @Override
    public void setLoanAmount(double loanAmount) {
        if (loanAmount > maxAmount) {
            System.out.println("Maximum loan amount is $1000");
            return;
        }
        super.setLoanAmount(loanAmount);
    }

    @Override
    public void setLoanTerm(int loanTerm) {
        if (!termOptions.contains(termOptions)) {
            System.out.println("The loan term for computer is between 1-2 years.");
            return;
        }
        super.setLoanTerm(loanTerm);
    }

}
