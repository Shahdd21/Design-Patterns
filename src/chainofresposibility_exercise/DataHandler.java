package chainofresposibility_exercise;

public class DataHandler implements MiddlewareHandler{

    private MiddlewareHandler next ;

    public DataHandler() {
    }

    public DataHandler(MiddlewareHandler next) {
        this.next = next;
    }

    @Override
    public MiddlewareHandler setNext(MiddlewareHandler middlewareHandler) {
        next = middlewareHandler;
        return next;
    }

    @Override
    public boolean handle(Data data) {
        if(next != null){
            return next.handle(data);
        }

        return true;
    }
}
