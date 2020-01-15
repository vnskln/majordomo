package pb.majordomo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Map;

public class DiceCombinationValidator implements ConstraintValidator<ValidDiceCombination, Map<Integer,String>> {

    @Override
    public void initialize(ValidDiceCombination constraintAnnotation) {
    }

    @Override
    public boolean isValid(Map<Integer, String> value, ConstraintValidatorContext context) {
        boolean result=true;
        System.out.println("Dice Set validation started");
        for(Integer key : value.keySet()) {
            if (!value.get(key).matches("\\d+")) {
                System.out.println("Dice set invalid");
                return false;
            }
        }
        System.out.println("Dice set valid");
        return true;
    }
}
