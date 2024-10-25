package ultimate;

public abstract class MessageFormaterTemplate implements MessageFormatter{

    private boolean validateMessage(Text text){
        return !text.getContent().isEmpty();
    }

    private boolean checkMessageSize(Text text){
        return text.getContent().length() > 1;
    }

    public Text formatMessage(Text text){
        if(validateMessage(text) && checkMessageSize(text)){
            return format(text);
        }

        else{
            System.out.println("The text didn't pass the checks so it can't be formatted");
            return text;
        }
    }
}
