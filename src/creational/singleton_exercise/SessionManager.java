package creational.singleton_exercise;

public class SessionManager {
    private SessionState sessionState = SessionState.DEACTIVATED;
    private static SessionManager sessionManager;

    private SessionManager(){}

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    public SessionState getSessionState() {
        return sessionState;
    }

    public static SessionManager getSessionManager(){
        if(sessionManager == null){
            synchronized (SessionManager.class){
                if(sessionManager == null){
                    sessionManager = new SessionManager();
                }
            }
        }

        return sessionManager;
    }
}
