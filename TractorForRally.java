/**
 * Created by User on 05.11.2016.
 */
public class TractorForRally extends Tractor {
    protected String teem;
    protected TractorForRally(String name, String type, int power, String teem) {
        super(name, type, power);
        this.teem=teem;
    }

    public void tract(Cars cars){
        System.out.println("TractorForRally перевозит ралийное авто");
    }
}
