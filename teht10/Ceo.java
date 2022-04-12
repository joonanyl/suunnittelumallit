package factorymethod.teht10;

public class Ceo extends Bossman {
    private final double RAISELIMIT = 1.50;
    public void handleRequest(RaiseRequest request) {
        if (request.getRaisePercentage() < RAISELIMIT)
            System.out.println("CEO has approved an raise of "
                    + Math.floor(((request.getRaisePercentage() - 1) * 100)) + "%. "
                    + "The new pay will be " + request.getRaisedPay());
        else
            System.out.println("A request of " + Math.floor(((request.getRaisePercentage() - 1) * 100))
                    + "% raise is outstanding! Get out of HERE!");
    }
}