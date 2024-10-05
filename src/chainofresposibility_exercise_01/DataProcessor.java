package chainofresposibility_exercise_01;

public class DataProcessor {

    private MiddlewareHandler handlerChain;

    public DataProcessor(MiddlewareHandler handlerChain) {
        this.handlerChain = handlerChain;
    }

    public boolean processData(Data data){
        if(!handlerChain.handle(data))
            return false;

        return true;
    }
}
