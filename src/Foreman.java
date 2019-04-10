public class Foreman extends Raise {
    private final double ALLOWABLE = 2.0;

    @Override
    public void processRequest(RaiseRequest request) {
        if (request.getPercent() <= ALLOWABLE) {
            System.out.println("Foreman accepts your raise request of " + request.getPercent() + " percent");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
