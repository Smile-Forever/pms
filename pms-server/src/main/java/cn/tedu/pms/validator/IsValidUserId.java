package cn.tedu.pms.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Smile
 * Created at 2019/1/6
 */

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = IsValidUserIdValidator.class)
public @interface IsValidUserId {
    //提示信息
    String message() default "id xxx";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
