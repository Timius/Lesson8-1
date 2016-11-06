/**
 * Created by User on 05.11.2016.
 */
public class Main {
    public static void main(String[] args){

    Tractor tractor = new Tractor();
        tractor.tract();

    CityCar cityCar = new CityCar();

    TractorForCity tractorForCity = new TractorForCity();
        tractorForCity.tract(cityCar);

    RallyCar rallyCar = new RallyCar();

    TractorForRally tractorForRally = new TractorForRally();
        tractorForRally.tract(rallyCar);

    Paver p = new Paver();
       p.setName("Асфальтоукладчик ");
       p.fly();
       p.rally();


    }
    }
