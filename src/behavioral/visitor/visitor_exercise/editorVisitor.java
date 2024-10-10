package behavioral.visitor.visitor_exercise;

public interface editorVisitor {
    public void visit(textFile file);
    public void visit(spreadSheet sheet);
    public void visit(presentationFile presentation);
}
