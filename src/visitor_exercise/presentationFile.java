package visitor_exercise;

public class presentationFile implements  sheet{
    @Override
    public void accept(editorVisitor visitor) {
        visitor.visit(this);
    }
}
