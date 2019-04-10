public class Main {
    public static void main(String[] args) {
        Raise foreman = new Foreman();
        Raise hod = new HeadOfDepartment();
        Raise ceo = new CEO();

        // Asetaan seuraajat
        foreman.setSuccessor(hod);
        hod.setSuccessor(ceo);

        // Foremanille
        foreman.processRequest(new RaiseRequest(1.5));

        // Head of Department
        foreman.processRequest(new RaiseRequest(4.0));

        // CEO
        foreman.processRequest(new RaiseRequest(6.0));
    }
}
