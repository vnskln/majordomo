package pb.majordomo.services;

import pb.majordomo.domains.Dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceRoller {

    private static Random random = new Random();

    public static void roll (List<Dice> diceSet) {

        for (Dice dice : diceSet) {
            List <Integer> results = new ArrayList<>();
            int roll = 0;
            int rollResult=0;
            for (int i=0; i<dice.getNumber();i++) {
                roll = random.nextInt(dice.getSides())+1+dice.getModifier();
                results.add(roll);
                rollResult+=roll;
            }
            dice.setPartialResult(results);
            dice.setResult(rollResult);
        }
    }
}
