package structural.decorator_exercise;

public class PlainText implements Text{

    @Override
    public String style() {
        return "Styling plain text";
    }
}
