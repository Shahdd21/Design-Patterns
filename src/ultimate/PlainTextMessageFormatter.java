package ultimate;

public class PlainTextMessageFormatter extends MessageFormaterTemplate {
    @Override
    public Text format(Text text) {
        return new PlainText(text.getContent());
    }
}
