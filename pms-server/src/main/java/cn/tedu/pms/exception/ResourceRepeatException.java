package cn.tedu.pms.exception;

/**
 * @author Smile
 * Created at 2018/12/27
 */
public class ResourceRepeatException extends RuntimeException {
    public ResourceRepeatException() {
    }

    public ResourceRepeatException(String message) {
        super(message);
    }

    public ResourceRepeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceRepeatException(Throwable cause) {
        super(cause);
    }

    public ResourceRepeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
