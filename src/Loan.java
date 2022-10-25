public class Loan {

    String borrowerName;
    int loanTerm;
    double loanAmount;
    double interestRate;
    LoanType loanType;

    //region Setters & Getters
    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount (double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate () {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }
//endregion

    public Loan() {
        this.borrowerName = borrowerName;
        this.loanTerm = loanTerm;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanType = loanType;
    }

    public Loan(String name, int term, double amount, double interest, LoanType type) {
        borrowerName = name;
        term = loanTerm;
        amount = loanAmount;
        interest = interestRate;
        type = loanType;
    }

}
