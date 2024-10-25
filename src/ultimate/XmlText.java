package ultimate;

public class XmlText extends Text{
    public XmlText(String content) {
        super(content + " converted to XML");
    }

    @Override
    public String getType() {
        return "XML format";
    }
}
