package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger {

    Predicate<String>  condition ;
    Logger loggerDelegate ;
    @Override
    public void log(String message) {

        if (this.condition.test(message))
        {
            this.loggerDelegate.log(message);
        }
    }

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        //TODO assign arguments to fields

        this.condition = condition ;
        this.loggerDelegate = delegate ;
    }
}
