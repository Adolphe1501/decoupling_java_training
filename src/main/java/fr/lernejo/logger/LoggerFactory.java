package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        //Logger console = new ConsoleLogger();
        Logger file = new FileLogger("logs.txt");

        Logger contextLogger = new ContextualLogger(name,file);
        return contextLogger;
    }
}
