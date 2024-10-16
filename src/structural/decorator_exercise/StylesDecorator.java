package structural.decorator_exercise;

public class StylesDecorator implements Text{

    private Text text;

    public StylesDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String  style() {
       return text.style();
    }
}
