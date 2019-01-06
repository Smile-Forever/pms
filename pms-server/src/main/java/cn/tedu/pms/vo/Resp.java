package cn.tedu.pms.vo;


import static cn.tedu.pms.vo.ResultCode.SUCCESS;

/**
 * @author Smile
 * Created at 2018/12/26
 */
public class Resp<T> {
    private int code;
    private T data;
    private String msg;

    public static <E> Resp<E> success() {
        return new Resp<E>().setCode(SUCCESS.getCode());
    }

    public static <E> Resp<E> success(E data) {
        return new Resp<E>().setCode(SUCCESS.getCode()).setData(data);
    }

    @Deprecated
    public static <E> Resp<E> failure(int code, String msg) {
        return new Resp<E>().setCode(code).setMsg(msg);
    }
    public static <E> Resp<E> failure(ResultCode code, String msg) {
        return new Resp<E>().setCode(code.getCode()).setMsg(msg);
    }

    public int getCode() {
        return code;
    }

    public Resp<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public Resp<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Resp<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "Resp{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
