package ultimate;

public class XmlMessageFormatter extends MessageFormaterTemplate {
    @Override
    public Text format(Text text) {
        return new XmlText(text.getContent());
    }
}
