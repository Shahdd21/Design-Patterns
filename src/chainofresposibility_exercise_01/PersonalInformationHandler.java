package chainofresposibility_exercise_01;

public class PersonalInformationHandler extends DataHandler{

    public PersonalInformationHandler() {
        super();
    }

    public PersonalInformationHandler(MiddlewareHandler next) {
        super(next);
    }

    @Override
    public boolean handle(Data data) {
        if(data.getUser().isEmpty())
            return false;

        return super.handle(data);
    }
}
