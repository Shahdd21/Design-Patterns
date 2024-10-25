package ultimate;

public class AbstractMiddlewareHandler implements MiddlewareHandler{

    private MiddlewareHandler next;

    @Override
    public MiddlewareHandler setNext(MiddlewareHandler middlewareHandler) {
        this.next = middlewareHandler;
        return next;
    }

    @Override
    public MiddlewareResponse handle(HttpRequest httpRequest) {
        if(next!=null){
            return next.handle(httpRequest);
        }

        return new MiddlewareResponse("Successfully passed all middlewares", true);
    }
}
