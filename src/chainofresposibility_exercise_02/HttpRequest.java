package chainofresposibility_exercise_02;

public class HttpRequest {
    private User user;
    private String message;

    public HttpRequest(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
