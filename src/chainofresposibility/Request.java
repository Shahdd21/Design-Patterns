package chainofresposibility;

public class Request {

    private String type;
    private boolean isAuthorized;
    private boolean isAuthenticated;
    private boolean hasPassedSecurityChecks;

    public Request(String type, boolean isAuthorized, boolean passedSecurityChecks, boolean isAuthenticated) {
        this.type = type;
        this.isAuthorized = isAuthorized;
        this.hasPassedSecurityChecks = passedSecurityChecks;
        this.isAuthenticated = isAuthenticated;
    }

    public String getType() {
        return type;
    }

    public boolean hasPassedSecurityChecks() {
        return hasPassedSecurityChecks;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }
}
