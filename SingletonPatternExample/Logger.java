public class Logger{
private static Logger instance;

private Logger(){
    System.out.println("constructor of Logger is private");
}
public static Logger getInstance(){
    if(instance==null){
        instance=new Logger();
    }
    return instance;
}
}