package factorymethod.teht10;

public abstract class Bossman {
    private Bossman successor;

    public void setSuccessor(Bossman successor) {
        this.successor = successor;
    }

    public void handleRequest(RaiseRequest request) {
        if (successor != null)
            successor.handleRequest(request);
    }
}
