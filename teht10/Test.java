package factorymethod.teht10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();
        Ceo ceo = new Ceo();
        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        try {
            while (true) {
                System.out.println("Enter your current pay and the amount of raise (in percentages) you would want " +
                        "to get so your application can be directed towards an appropriate manager\n");
                System.out.println("Current pay: ");
                double pay = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.println("Raise");
                double raise = 1 + Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine()) / 100;
                manager.handleRequest(new RaiseRequest(raise, pay));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
