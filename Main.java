/**
 * Created by User on 05.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

    PassengerCar passengerCar = new PassengerCar("Forza", "Легковая", "Хечбєк");
    CityCar cityCar = new CityCar("BMW", "Легковая", "Седан", 5);
    RallyCar rallyCar = new RallyCar("BMW", "Легковая", "Спортивная", 4.3);

    Tractor tractor = new Tractor("Ford", "Грузовая", 2000);
        tractor.tract(passengerCar);

    Tractor tractorForCity = new TractorForCity("Man", "Грузовая", 2000, 8);
        try{
            tractorForCity.tract(rallyCar);}
        catch (MyExceptionCity e) {
            System.out.println(e);
        }

    TractorForRally tractorForRally = new TractorForRally("Mersedes", "Грузовая",
            2000, "RedBull");
        try{
            tractorForRally.tract(cityCar);}
        catch (MyExctptionRally e) {
            System.out.println(e);
    }

    Paver p = new Paver();
       p.setName("Асфальтоукладчик ");
       p.fly();
       p.rally();
    }
    }
