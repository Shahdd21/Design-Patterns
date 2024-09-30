package template_exercise_02;

public abstract class Formatter {

    public final void format(String message){
        validateMessage();
        checkMessageSize();
        System.out.println(formatttedMessage(message));
    }

    private void validateMessage(){
        System.out.println("Validating messages");
    }

    private void checkMessageSize(){
        System.out.println("Checking message size");
    }

    protected abstract String formatttedMessage(String message);
}
