package behavioral.visitor.visitor_exercise;

public class textFile implements sheet{
    @Override
    public void accept(editorVisitor visitor) {
        visitor.visit(this);
    }
}
