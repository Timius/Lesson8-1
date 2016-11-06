/**
 * Created by User on 06.11.2016.
 */
public class Paver implements Fly,Rally{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fly(){
        System.out.println(getName() + "может летать");
    }

    public void rally(){
        System.out.println(getName() + "участвует в гонках");
    }
}

