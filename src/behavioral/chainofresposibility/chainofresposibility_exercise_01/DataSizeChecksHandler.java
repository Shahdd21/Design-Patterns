package behavioral.chainofresposibility.chainofresposibility_exercise_01;

public class DataSizeChecksHandler extends DataHandler{

    public DataSizeChecksHandler() {
        super();
    }

    public DataSizeChecksHandler(MiddlewareHandler next) {
        super(next);
    }

    @Override
    public boolean handle(Data data) {
        if(data.getSize() < 100)
            return false;

        return super.handle(data);
    }
}
