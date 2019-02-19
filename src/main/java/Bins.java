import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer,Integer> results;


    public Bins(Integer minRoll, Integer maxRoll){
        results = new TreeMap();
        for (int i = minRoll ; i <= maxRoll; i++) {
            results.put(i,0);
        }
    }

    public void incrementBin(Integer binKey){
        results.put(binKey, results.get(binKey)+1);
    }

    public Integer getBins(Integer binKey){
        return results.get(binKey);
    }
}
