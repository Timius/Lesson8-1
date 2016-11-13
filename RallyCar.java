/**
 * Created by User on 05.11.2016.
 */
public class RallyCar extends PassengerCar {
    protected double accelerationSpeed;
    public RallyCar(String name, String type, String suborder, double accelerationSpeed) {
        super(name, type, suborder);
        this.accelerationSpeed=accelerationSpeed;
    }
}
