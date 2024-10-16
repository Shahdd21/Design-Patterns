package structural.decorator_exercise;

public class UnderlineStyle extends StylesDecorator{
    public UnderlineStyle(Text text) {
        super(text);
    }

    @Override
    public String style() {
        return super.style() + "with underline";
    }
}
