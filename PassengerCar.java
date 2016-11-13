/**
 * Created by User on 05.11.2016.
 */
public class PassengerCar extends Cars {
    protected String suborder;
    public PassengerCar(String name, String type, String suborder)    {
        setName(name);
        setType(type);
        this.suborder=suborder;
    }
}
