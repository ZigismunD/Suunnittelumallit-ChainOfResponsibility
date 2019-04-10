public class HeadOfDepartment extends Raise {
    private final double ALLOWABLE = 5.0;
    @Override
    public void processRequest(RaiseRequest request) {
        if (request.getPercent() <= ALLOWABLE) {
            System.out.println("Head Of Department accepts your raise request of " + request.getPercent() + " percent");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
