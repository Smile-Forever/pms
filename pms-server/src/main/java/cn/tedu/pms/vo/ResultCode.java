package cn.tedu.pms.vo;

/**
 * @author Smile
 * Created at 2019/1/6
 */
public enum ResultCode {
    SERVER_ERROR(500,"服务端异常，稍后重试"),
    RESOURCE_REPEAT(400,"资源重复"),
    SUCCESS(0, "一切正常")
    ;
    private int code;
    private String descc;

    ResultCode(int code, String descc) {
        this.code = code;
        this.descc = descc;
    }

    public int getCode() {
        return code;
    }

    public String getDescc() {
        return descc;
    }
}
