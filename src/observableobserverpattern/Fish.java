package observableobserverpattern;
import java.util.*;
public class Fish implements Observer{

    
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName()+ "was just fed"); 
    }

}
