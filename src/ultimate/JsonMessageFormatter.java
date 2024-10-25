package ultimate;

public class JsonMessageFormatter extends MessageFormaterTemplate {
    @Override
    public Text format(Text text) {
        return new JsonText(text.getContent());
    }
}
