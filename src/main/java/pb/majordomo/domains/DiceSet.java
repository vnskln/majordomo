package pb.majordomo.domains;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {

    private List<Dice> diceList;

    public DiceSet () {}

    public DiceSet (DiceSetCreator diceSetCreator) {
        diceList = new ArrayList<>();
        for (int i : diceSetCreator.getDiceCombination().keySet()) {
            int number = Integer.parseInt(diceSetCreator.getDiceCombination().get(i));
            if (number!=0) {
                for (int j=0; j<number; j++)
                    diceList.add(new Dice ("", i, 1, 0));
            }
        }
    }

    public List<Dice> getDiceList() {
        return diceList;
    }

    public void setDiceList(List<Dice> diceList) {
        this.diceList = diceList;
    }
}
