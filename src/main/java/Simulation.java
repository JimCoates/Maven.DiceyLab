import java.util.Set;
import java.util.*;

import java.util.Iterator;

public class Simulation {
    public Simulation(){
    }

    public void runSimulation(Integer numberOfDice, Integer numberOfRolls){
        Dice dice = new Dice(numberOfDice);
        Bins bins = new Bins(numberOfDice,numberOfDice * 6);

        for(int i = 0; i <= numberOfRolls; i++){
            bins.incrementBin(dice.tossAndSum());
        }

        for (int i = numberOfDice; i < numberOfDice * 6; i++) {
          System.out.println(i+": " + bins.getBins(i));
        }
    }

}
