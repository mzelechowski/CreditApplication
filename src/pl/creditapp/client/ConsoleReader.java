package pl.creditapp.client;

import pl.creditapp.core.Person;

import java.util.Scanner;

public class ConsoleReader {
    public Person readInputParameters(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();

        System.out.println("Enter your last name: ");
        String lastName = in.next();

        System.out.println("Enter your mohters maiden name: ");
        String mothersMaidenName = in.next();

        System.out.println("Enter total monthly income in PLN: ");
        double income = in.nextDouble();

        System.out.println("Are you married: ");
        boolean married = in.nextBoolean();

        System.out.println("Enter number of family dependants (including applicant): ");
        int numOfDependants = in.nextInt();

        return new Person(name, lastName, mothersMaidenName, income, married, numOfDependants);
    }
}
