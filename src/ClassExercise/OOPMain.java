package ClassExercise;

public class OOPMain {
    public static void main(String[] args) {
        Customer cust = new Customer("joe","blogs");
        cust.setFirstName("b");
        cust.setLastName("s");
        cust.getFirstName();
        cust.getLastName();
        cust.print();

        Door dd = new Door();
        dd.getName("driver");
        dd.open();
        dd.doorStatus();
        Door pd = new Door();
        pd.getName("passenger");
        pd.closed();
        pd.doorStatus();

    }
}
