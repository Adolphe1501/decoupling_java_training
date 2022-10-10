package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {

    public static Logger getLogger(String name){

       // Predicate<String> condition = message → !message.contains("player");
        Logger contextLogger = new ContextualLogger(name,new FileLogger("logs.txt"));
        Logger compositeLogger = new CompositeLogger(contextLogger, new ConsoleLogger());
        return compositeLogger;
    }
}
