
package observableobserverpattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableObserverPattern {

    public static void main(String[] args) {
List<Fish> fishies = new ArrayList<>();
fishies.add(new Fish("loki"));
fishies.add(new Fish("moki"));
fishies.add(new Fish("toki"));
FishFeeder feeder = new FishFeeder();
for(Fish fish :fishies){
    feeder.addObserver(fish);
    
}
feeder.feedTheFish();

    }
    
}
