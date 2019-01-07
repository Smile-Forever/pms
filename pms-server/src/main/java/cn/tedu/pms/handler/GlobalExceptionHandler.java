package cn.tedu.pms.handler;

import cn.tedu.pms.exception.*;
import cn.tedu.pms.vo.Resp;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import static cn.tedu.pms.vo.ResultCode.RESOURCE_REPEAT;
import static cn.tedu.pms.vo.ResultCode.SERVER_ERROR;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@RestControllerAdvice
@Slf4j //private final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);
public class GlobalExceptionHandler {
    @ExceptionHandler(Throwable.class)
    public Resp processThrowable(Throwable throwable) {
//        throwable.printStackTrace();
        log.error("erro....", throwable);
        return Resp.failure(SERVER_ERROR, "服务端异常,稍后重试");
    }

    @ExceptionHandler(ResourceRepeatException.class)
    public Resp processResourceRepeatException(ResourceRepeatException e) {
        return Resp.failure(RESOURCE_REPEAT, e.getMessage());
    }

    @ExceptionHandler(ParamException.class)
    public Resp processParamException(ParamException e) {
        return Resp.failure(401, e.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public Resp processResourceNotFoundException(ResourceNotFoundException e) {
        return Resp.failure(402, e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Resp processBindException(MethodArgumentNotValidException e) {

        return Resp.failure(40233333, e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    /**
     * 违反了Unique约束的异常
     *
     * @param e
     * @return 错误是的状态码，以及消息
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Resp processDuplicateKeyException(DuplicateKeyException e) {
        return Resp.failure(403, e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView processNoHandlerFoundException(NoHandlerFoundException e) {
        return new ModelAndView("forward:/index.html");
    }

    /**
     * 插入异常
     *
     * @param e
     * @return 错误是的状态码，以及消息
     */
    @ExceptionHandler(InsertException.class)
    public Resp processInsertException(InsertException e) {
        return Resp.failure(404, e.getMessage());
    }
}
