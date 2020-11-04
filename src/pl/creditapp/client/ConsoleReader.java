package pl.creditapp.client;


import pl.creditapp.core.model.*;

import java.util.Scanner;

public class ConsoleReader {
    public Person readInputParameters() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();

        System.out.println("Enter your last name: ");
        String lastName = in.next();

        System.out.println("Enter your mohters maiden name: ");
        String mothersMaidenName = in.next();

        System.out.println("What is your marital status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED)");
        MaritalStatus maritalStatus = MaritalStatus.valueOf(in.next());

        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Education education = Education.valueOf(in.next());

        System.out.println("Enter your email addreess: ");
        String email = in.next();

        System.out.println("Enter your phone number: ");
        String phoneNumber = in.next();

        System.out.println("Enter total monthly income in PLN");
        double income = in.nextDouble();

        System.out.println("Enter number of family dependants (including applicant): ");
        int numOfDependants = in.nextInt();

        System.out.println("What's purpose of loan? MORTGAGE | PERSONAL_LOAN");
        PurposeOfLoanType purposeOfLoanType = PurposeOfLoanType.valueOf(in.next());

        System.out.println("Enter total monthly income in PLN: ");
        double purposeOfLoanAmount = in.nextDouble();

        PersonalData personalData = new PersonalData(name, lastName, mothersMaidenName, income, maritalStatus, education, numOfDependants);
        ContactData contactData = new ContactData(email, phoneNumber);
        PurposeOfLoan purposeOfLoan = new PurposeOfLoan(purposeOfLoanType, purposeOfLoanAmount);

        return new Person(personalData, contactData);
    }
}
