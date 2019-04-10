public class CEO extends Raise {

    @Override
    public void processRequest(RaiseRequest request) {

        System.out.println("CEO accepts your raise request of " + request.getPercent() + " percent");

    }
}
