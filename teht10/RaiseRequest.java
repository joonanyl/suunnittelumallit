package factorymethod.teht10;

public class RaiseRequest {
    private double raisePercentage;
    private double raisedPay;

    public RaiseRequest(double raise, double oldPay) {
        this.raisePercentage = raise;
        this.raisedPay = oldPay * raise;
    }

    public double getRaisePercentage() {
        return raisePercentage;
    }

    public void setRaisePercentage(double raisePercentage) {
        this.raisePercentage = raisePercentage;
    }

    public double getRaisedPay() {
        return raisedPay;
    }
}
