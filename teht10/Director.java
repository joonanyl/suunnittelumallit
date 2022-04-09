package factorymethod.teht10;

public class Director extends Bossman {
    private final double RAISELIMIT = 1.05;

    public void handleRequest(RaiseRequest request) {
        if (request.getRaisePercentage() <= RAISELIMIT)
            System.out.println("Director has approved an raise of "
                    + Math.floor(((request.getRaisePercentage() - 1) * 100)) + "%. "
                    + "The new pay will be " + request.getRaisedPay());
        else
            super.handleRequest(request);
    }
}
