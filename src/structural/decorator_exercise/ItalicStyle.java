package structural.decorator_exercise;

public class ItalicStyle extends StylesDecorator{
    public ItalicStyle(Text text) {
        super(text);
    }

    @Override
    public String style() {
        return super.style() + "with Italic";
    }
}
