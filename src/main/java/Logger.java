import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private static Logger logger = null;

    private Logger() {}
    public static Logger getInstance(){
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now().format(formatter) + " " + num++ + "] " + msg);
    }
}
