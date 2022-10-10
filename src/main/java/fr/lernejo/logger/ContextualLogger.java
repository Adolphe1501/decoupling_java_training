package fr.lernejo.logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger {

    String name;
    Logger logger;
    @Override
    public void log(String message) {
        this.logger.log(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")) + " " + this.name + " " + message);
    }
    public ContextualLogger(String name, Logger logger){
        this.name = name ;
        this.logger = logger ;
    }
}
