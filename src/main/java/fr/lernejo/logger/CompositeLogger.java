package fr.lernejo.logger;

public class CompositeLogger implements Logger {

    Logger fileLogger ;
    Logger consoleLogger ;
    @Override
    public void log(String message) {

        this.fileLogger.log(message);
        this.consoleLogger.log(message);
    }

    public CompositeLogger(Logger fileLogger, Logger consoleLogger)
    {
        this.consoleLogger = consoleLogger ;
        this.fileLogger = fileLogger ;

    }
}
