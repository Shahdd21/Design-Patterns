package behavioral.chainofresposibility;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);
    boolean handle(Request request);
}
