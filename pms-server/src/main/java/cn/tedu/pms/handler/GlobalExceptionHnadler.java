package cn.tedu.pms.handler;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@RestControllerAdvice
public class GlobalExceptionHnadler {
    @ExceptionHandler(Throwable.class)
    public Object processThrowable(Throwable throwable){
        throwable.printStackTrace();
        HashMap<Object, Object> map = Maps.newHashMap();
        map.put("exp",throwable.getMessage());
        return map;
    }

    @ExceptionHandler(ArithmeticException.class)
    public Object processArith(ArithmeticException e){
        e.printStackTrace();
        HashMap<Object, Object> map = Maps.newHashMap();
        map.put("msg","xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return map;
    }
}
