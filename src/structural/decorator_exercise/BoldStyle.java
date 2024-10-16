package structural.decorator_exercise;

public class BoldStyle extends StylesDecorator{

    public BoldStyle(Text text) {
        super(text);
    }

    @Override
    public String style() {
        return super.style() +" with Bold" ;
    }
}
