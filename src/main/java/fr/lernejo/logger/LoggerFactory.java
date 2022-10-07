package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger console = new ConsoleLogger();
        return console;
    }
}
