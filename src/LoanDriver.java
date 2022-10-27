import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Ian Cunningham
 * Date: 10/27/2022
 * File: LoanDriver.java
 */

public class LoanDriver {

    public static void main(String[] args) {

        /** How many loan accounts would you like to create? */
        int iterations = 3;

        Scanner input = new Scanner(System.in);
        ArrayList<Loan> loans = new ArrayList<Loan>();

        System.out.println("Welcome to Centennial Banking Loan Portal");
        System.out.println("Which loan would you like to select?");

        do {

            /** Brings loan object into scope */
            Loan loan = null;
            LoanType type = null;

            /** User selects loan type
             * Checks user only enters a valid entry */
            do {
                System.out.println("1 = Computer Loan | 2 = Accommodation Loan | 3 = Tuition Loan");
                System.out.print("Please select one of the following: ");
                try {
                    type = Loan.selectLoan(input.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Please enter one of the following integers.");
                    input.nextLine();
                }
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

            /** Nested if block will first check the Loan Type, and then
             * it will check the requirements for it, if all conditions
             * are met. The object is upcasted to the correct class
             * and then the object is added to the array of loan accounts */
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

        } while (loans.size() != iterations);

        /** Prints out array of loans created */
        System.out.println("-----Printing Loan Account Details-----\n");
        loans.forEach(l -> System.out.println(l + "\n" + l.administrationFees() + "\n"));

    }
}
