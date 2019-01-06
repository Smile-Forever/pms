package cn.tedu.pms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static cn.tedu.pms.utils.ValidateUtils.isValidUserName;

/**
 * @author Smile
 * Created at 2019/1/6
 */
public class IsValidUserNameValidator implements ConstraintValidator<IsValidUserName, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isValidUserName(value);
    }
}
