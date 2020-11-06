package pl.creditapp;

import pl.creditapp.client.ConsoleReader;
import pl.creditapp.core.CreditApplicationService;
import pl.creditapp.core.model.CreditApplication;


public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();
        CreditApplication creditApplication = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(creditApplication);
        System.out.println(decision);

    }
}
