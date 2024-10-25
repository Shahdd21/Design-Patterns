package ultimate;

import creational.singleton_exercise.SessionManager;

public class Logger {
    private String logInfo;
    private static Logger logger;

    private Logger(){}

    public void setLogInfo(String logInfo){
        this.logInfo = logInfo;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public static Logger getLogger(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }

        return logger;
    }
}
