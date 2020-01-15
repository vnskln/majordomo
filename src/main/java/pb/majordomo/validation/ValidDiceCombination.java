package pb.majordomo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DiceCombinationValidator.class)
public @interface ValidDiceCombination {
    String message() default "{pb.majordomo.validation.ValidDiceCombination.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
