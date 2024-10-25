package ultimate;

public class User {
    private String userName;
    private boolean hasPassedSecurityChecks;
    private boolean isAuthorized;
    private boolean isAuthenticated;

    public User(String userName, boolean isAuthenticated, boolean isAuthorized, boolean hasPassedSecurityChecks) {
        this.userName = userName;
        this.isAuthenticated = isAuthenticated;
        this.isAuthorized = isAuthorized;
        this.hasPassedSecurityChecks = hasPassedSecurityChecks;
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasPassedSecurityChecks() {
        return hasPassedSecurityChecks;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
