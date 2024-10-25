package ultimate;

public class JsonText extends Text{
    public JsonText(String content) {
        super(content+ " converted to JSON");
    }

    public String getType(){
        return "JSON format";
    }
}
