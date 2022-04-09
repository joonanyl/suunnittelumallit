package factorymethod.teht10;

public class Manager extends Bossman {
    private final double RAISELIMIT = 1.02;

    public void handleRequest(RaiseRequest request) {
        System.out.println(request.getRaisePercentage());
        if (request.getRaisePercentage() <= RAISELIMIT)
            System.out.println("Manager has approved an raise of " + Math.floor(((request.getRaisePercentage() - 1) * 100)) + "%. "
            + "The new pay will be " + request.getRaisedPay());
        else
            super.handleRequest(request);
    }
}
