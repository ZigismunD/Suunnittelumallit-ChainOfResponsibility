public abstract class Raise {
    protected Raise successor;

    public void setSuccessor(Raise successor) {
        this.successor = successor;
    }

    abstract public void processRequest(RaiseRequest request);
}
