public class CEO extends Raise {
    private final double ALLOWABLE = 5.0;
    @Override
    public void processRequest(RaiseRequest request) {

        System.out.println("CEO accepts your raise request of " + request.getPercent() + " percent");

    }
}
