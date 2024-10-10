package behavioral.visitor.visitor_exercise;

public class spreadSheet implements sheet{
    @Override
    public void accept(editorVisitor visitor) {
        visitor.visit(this);
    }
}
