package cn.tedu.pms.vo;

/**
 * @author Smile
 * Created at 2018/12/26
 */
public class Resp<T> {
    private int code;
    private T data;
    private String msg;

    public static <E> Resp<E> success() {
        return new Resp<E>().setCode(0);
    }

    public static <E> Resp<E> success(E data) {
        return new Resp<E>().setCode(0).setData(data);
    }

    public static <E> Resp<E> failure(int code, String msg) {
        return new Resp<E>().setCode(code).setMsg(msg);
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
