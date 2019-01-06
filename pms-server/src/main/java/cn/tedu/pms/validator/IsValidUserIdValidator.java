package cn.tedu.pms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Smile
 * Created at 2019/1/6
 */
public class IsValidUserIdValidator implements ConstraintValidator<IsValidUserId, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        // TODO 搬出来 unique
        return value != null && value > 0;
    }
}
