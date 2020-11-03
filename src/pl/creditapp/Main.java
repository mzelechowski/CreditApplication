package pl.creditapp;

import pl.creditapp.client.ConsoleReader;
import pl.creditapp.core.CreditApplicationService;
import pl.creditapp.core.model.Person;


public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();
        Person person = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(person);
        System.out.println(decision);

    }
}
