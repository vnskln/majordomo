package pb.majordomo.domains;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class Dice {

    private String tag;
    private int sides;

    @NotBlank(message = "required")
    @DecimalMin(value = "0", message = "has to be bigger than 0")
    @DecimalMax(value = "100", message = "has to be lower than 100")
    private int number;

    @NotBlank(message = "required")
    private int modifier;

    private List<Integer> partialResult;
    private int result;

    public Dice () {}

    public Dice (String tag, int sides, int number, int modifier) {
        this.tag = tag;
        this.sides = sides;
        this.number = number;
        this.modifier = modifier;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public List <Integer> getPartialResult() {
        return partialResult;
    }

    public void setPartialResult(List <Integer> partialResult) {
        this.partialResult = partialResult;
    }
}
