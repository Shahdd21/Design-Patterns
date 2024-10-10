package behavioral.chainofresposibility;

public class AbstractMiddlewareHandler implements MiddlewareHandler{

    private MiddlewareHandler next;

    @Override
    public MiddlewareHandler setNext(MiddlewareHandler middlewareHandler) {
        next = middlewareHandler;
        return next;
    }

    @Override
    public boolean handle(Request request) {
        if(next != null){
            return next.handle(request);
        }

        return true;
    }
}
