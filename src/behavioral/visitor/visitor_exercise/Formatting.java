package behavioral.visitor.visitor_exercise;

public class Formatting implements editorVisitor{
    @Override
    public void visit(textFile file) {
        System.out.println("Formatting for a text file");
    }

    @Override
    public void visit(spreadSheet sheet) {
        System.out.println("Formatting for a spread sheet");
    }

    @Override
    public void visit(presentationFile presentation) {
        System.out.println("Formatting for a presentation file");
    }
}
