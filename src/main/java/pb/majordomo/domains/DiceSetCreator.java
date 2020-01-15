package pb.majordomo.domains;

import pb.majordomo.validation.ValidDiceCombination;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiceSetCreator {

    @ValidDiceCombination
    private Map <Integer,String> diceCombination;

    public DiceSetCreator () {
        diceCombination = new LinkedHashMap<>();
        diceCombination.put(4,"0");
        diceCombination.put(6,"0");
        diceCombination.put(8,"0");
        diceCombination.put(10,"0");
        diceCombination.put(12,"0");
        diceCombination.put(20,"0");
        diceCombination.put(100,"0");
    }

    public Map<Integer, String> getDiceCombination() {
        return diceCombination;
    }

    public void setDiceCombination(Map<Integer, String> diceCombination) {
        this.diceCombination = diceCombination;
    }
}

