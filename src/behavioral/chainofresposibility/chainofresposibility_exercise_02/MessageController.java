package behavioral.chainofresposibility.chainofresposibility_exercise_02;

public class MessageController {
    private HttpRequest httpRequest;

    public MessageController(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }
}
