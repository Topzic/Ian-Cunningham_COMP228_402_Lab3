public class Loan {

    /** Declared as private to follow guidelines of Encapsulation */
    private String borrowerName;
    private int loanTerm;
    private double loanAmount;
    private double interestRate;
    private static LoanType loanType;

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
        this.borrowerName = "";
        this.loanTerm = 0;
        this.loanAmount = 0;
        this.interestRate = 0.0;
        this.loanType = LoanType.Accommodation;
    }

    /** Constructor for user input */
    public Loan(String name, int term, double amount, double interest, LoanType type) {
        borrowerName = name;
        term = loanTerm;
        amount = loanAmount;
        interest = interestRate;
        type = loanType;
    }

    public static LoanType selectLoan(int userInput) {
        if (userInput == 1) {
            loanType = LoanType.Computer;
            return loanType;
        } else if (userInput == 2) {
            loanType = LoanType.Accommodation;
            return loanType;
        } else if (userInput == 3) {
            loanType = LoanType.Tuition;
            return loanType;
        }
        return null;
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
                "$" + monthlyInstallments(loanAmount, interestRate, loanTerm);
    }

    public String administrationFees() {
        double adminFee = getLoanAmount() * getInterestRate() / 100;
        if (loanType == LoanType.Tuition) {
            return "Administration Fee for loan type Tuition is $" + adminFee;
        } else if (loanType == LoanType.Computer) {
            return "Administration Fee for loan type Computer is $0.";
        } else if (loanType == LoanType.Accommodation) {
            return "Administration Fee for loan type Accommodation is $65.";
        }
        return "You do not have a loan type.";
    }

}
