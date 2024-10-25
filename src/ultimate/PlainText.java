package ultimate;

public class PlainText extends Text{
    public PlainText(String content) {
        super(content);
    }

    public String getType(){
        return "JSON format";
    }
}
