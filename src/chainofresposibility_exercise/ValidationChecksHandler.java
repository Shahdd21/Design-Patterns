package chainofresposibility_exercise;

public class ValidationChecksHandler extends DataHandler{

    public ValidationChecksHandler() {
        super();
    }

    public ValidationChecksHandler(MiddlewareHandler next) {
        super(next);
    }

    @Override
    public boolean handle(Data data) {
        if(data.getType().equalsIgnoreCase("dummy"))
            return false;

        return super.handle(data);
    }
}
