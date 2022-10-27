import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Only create objects and store them if the Loan is approved using the validation table.
 * Your loop needs to keep going till 3 Loan Objects are created and stored in the array.
 * Upcasting is covered in Week 5 Lecture under Polymorphism with the example, use the same logic here based on conditions.
 */

public class LoanDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Loan> loans = new ArrayList<Loan>();

        System.out.println("Welcome to Centennial Banking Loan Portal");
        System.out.println("Which loan would you like to select?");

        do {

            /** Brings loan object into scope */
            Loan loan = null;
            LoanType type;

            /** User selects loan type
             * Checks user only enters a valid entry */
            do {
                System.out.println("1 = Computer Loan | 2 = Accommodation Loan | 3 = Tuition Loan");
                System.out.print("Please select one of the following: ");
                type = Loan.selectLoan(input.nextInt());
            } while (type != LoanType.Computer && type != LoanType.Accommodation && type != LoanType.Tuition);
            input.nextLine();

             /** User enters name */
            System.out.print("Please enter your name: ");
            String name = input.nextLine();

             /** User enters length of term */
            System.out.print("Please enter length of term: ");
            int term = input.nextInt();

             /** User enters loan amount */
            System.out.print("Please enter loan amount: ");
            int amount = input.nextInt();

            if (type == LoanType.Computer) {
                if (ComputerLoan.loanRequirements(amount, term)) {
                    loan = new ComputerLoan(name, term, amount, LoanType.Computer);
                    loans.add(loan);
                }
            } else if (type == LoanType.Accommodation) {
                if (AccommodationLoan.loanRequirements(amount, term)) {
                    loan = new AccommodationLoan(name, term, amount, LoanType.Accommodation);
                    loans.add(loan);
                }
            } else if (type == LoanType.Tuition) {
                if (TuitionLoan.loanRequirements(amount, term)) {
                    loan = new TuitionLoan(name, term, amount, LoanType.Tuition);
                    loans.add(loan);
                }
            } else {
            System.out.println("Loan type not found, please try again.");
        }

        } while (loans.size() != 3);

        /** Prints out array of loans created */
        loans.forEach(l -> System.out.println(l + "\n" + l.getClass()));

    }
}
