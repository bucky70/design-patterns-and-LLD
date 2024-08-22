package decorator;

public interface Logger {
    void log(String message);
}

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File: " + message);
    }
}

public class LoggerFactory {
    public static Logger getLogger(String type) {
        if (type.equals("console")) {
            return new ConsoleLogger();
        } else if (type.equals("file")) {
            return new FileLogger();
        }
        return null;
    }
}

public class LoggerDecorator implements Logger {
    private Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
        System.out.println("LoggerDecorator: " + message);
    }
}