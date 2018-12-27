package cn.tedu.pms.handler;

import cn.tedu.pms.exception.ParamException;
import cn.tedu.pms.exception.ResourceNotFoundException;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.vo.Resp;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Throwable.class)
    public Resp processThrowable(Throwable throwable) {
        throwable.printStackTrace();
        return Resp.failure(500, "服务端异常,稍后重试");
    }

    @ExceptionHandler(ResourceRepeatException.class)
    public Resp processResourceRepeatException(ResourceRepeatException e) {
        return Resp.failure(40000, e.getMessage());
    }

    @ExceptionHandler(ParamException.class)
    public Resp processParamException(ParamException e) {
        return Resp.failure(40001, e.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public Resp processResourceNotFoundException(ResourceNotFoundException e) {
        return Resp.failure(40002, e.getMessage());
    }
}
