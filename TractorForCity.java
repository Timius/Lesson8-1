/**
 * Created by User on 05.11.2016.
 */
public class TractorForCity extends Tractor {

    protected int numberCars; //количество перевозимых авто

    protected TractorForCity(String name, String type, int power, int numberCars) {
        super(name, type, power);
        this.numberCars = numberCars;
    }

    public void tract(Cars cars) throws MyExceptionCity {
        if (cars instanceof RallyCar)
            throw new MyExceptionCity();
        System.out.println("TractorForCity перевозит обычное (city) авто");
    }
}