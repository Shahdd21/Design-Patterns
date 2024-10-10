package behavioral.chainofresposibility.chainofresposibility_exercise_01;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);
    boolean handle(Data data);
}
