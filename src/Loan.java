public class Loan {

    /** Declared as private to follow guidelines of Encapsulation */
    private String borrowerName;
    private int loanTerm;
    private double loanAmount;
    private double interestRate;
    private LoanType loanType;

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

    /** Default Constructor */
    public Loan() {
        this.borrowerName = borrowerName;
        this.loanTerm = loanTerm;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanType = loanType;
    }

    /** Constructor for user input */
    public Loan(String name, int term, double amount, double interest, LoanType type) {
        borrowerName = name;
        term = loanTerm;
        amount = loanAmount;
        interest = interestRate;
        type = loanType;
    }

    /** Calculates monthly payments for user */
    public double monthlyInstallments(double loanAmount, double interestRate, int loanTerm) {
        double installment = (loanAmount + ((interestRate / 100) * loanAmount)) / (loanTerm * 12);
        return installment;
    }

    /** Prints loan details & Monthly installments */
    @Override
    public String toString() {
        return "Loan{" +
                "borrowerName='" + borrowerName + '\'' +
                ", loanTerm=" + loanTerm +
                ", loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", loanType=" + loanType +
                '}';
    }

    public String adminFees() {
        return "";
    }

}
