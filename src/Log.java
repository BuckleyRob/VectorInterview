import java.util.InputMismatchException;

public class Log {
    public String date;
    public String hostName;
    public String error;
    public static Log BuildLog(String stringLog){
        var parts = stringLog.split(" ");
        if(parts.length != 3)
            throw new InputMismatchException("");

        var log = new Log();
        log.date = parts[0];
        log.hostName = parts[1];
        log.error = parts[2];
        return log;
    }
}
