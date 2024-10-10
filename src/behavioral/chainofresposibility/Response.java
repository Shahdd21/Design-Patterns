package behavioral.chainofresposibility;

public class Response {

    private String reason;
    private boolean isSuccessful;

    public Response(String reason, boolean isSuccessful) {
        this.reason = reason;
        this.isSuccessful = isSuccessful;
    }

    public String getReason() {
        return reason;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
}
