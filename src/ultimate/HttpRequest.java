package ultimate;

public class HttpRequest{
    private String message;
    private User user;

    public HttpRequest(String message, User user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
