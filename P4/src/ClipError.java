public class ClipError extends Exception{
    //无参构造方法
    public ClipError(){
        super();
    }

    //用指定原因构造一个新的异常
    public ClipError(Throwable cause) {
        super(cause);
    }
    //有参的构造方法
    public ClipError(String message){
        super(message);
    }
}
