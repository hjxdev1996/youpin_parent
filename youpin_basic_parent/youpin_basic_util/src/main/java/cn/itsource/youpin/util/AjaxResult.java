package cn.itsource.youpin.util;

/**
 * 为了使用链式编程，极大地方便了编程的代码 将set方法的值设置为返回当前对象
 */
public class AjaxResult {
    private Boolean success=true;
    private String msg="操作成功";
    private Object object;//为了获取的返回对象
    public Boolean getSuccess() {
        return success;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return  this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
