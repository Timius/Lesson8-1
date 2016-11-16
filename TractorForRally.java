/**
 * Created by User on 05.11.2016.
 */
public class TractorForRally extends Tractor {
    protected String teem;
    protected TractorForRally(String name, String type, int power, String teem) {
        super(name, type, power);
        this.teem=teem;
    }

    public void tract(Cars cars) throws MyExctptionRally{
        if (cars instanceof CityCar)
            throw new MyExctptionRally();
        System.out.println("TractorForRally везет ралийное авто");
    }

}
//if (p != null) {
//        try {
//        p.addCard(getNextCard());
//        } catch (CardExeption e) {
//        throw new RuntimeException(e);
//        }
//        }