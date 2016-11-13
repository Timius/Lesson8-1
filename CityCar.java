/**
 * Created by User on 05.11.2016.
 */
public class CityCar extends PassengerCar {
    protected int numberPlace; //количество мест
    public CityCar(String name, String type, String suborder, int numberPlace) {
        super(name, type, suborder);
        this.numberPlace=numberPlace;
    }
}
