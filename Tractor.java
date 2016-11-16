/**
 * Created by User on 05.11.2016.
 */
public class Tractor extends Truck {
    protected String forTypeCars;
    protected Tractor(String name, String type, int power) {
        super(name, type, power);
        this.forTypeCars = forTypeCars;
    }

    public void tract(Cars cars) throws Exception {
        System.out.println("Тягач перевозит авто");
    }
}
