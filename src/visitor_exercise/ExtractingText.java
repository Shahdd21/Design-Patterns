package visitor_exercise;

public class ExtractingText implements editorVisitor{
    @Override
    public void visit(textFile file) {
        System.out.println("Extracting text for a text file");
    }

    @Override
    public void visit(spreadSheet sheet) {
        System.out.println("Extracting text for a spread sheet");
    }

    @Override
    public void visit(presentationFile presentation) {
        System.out.println("Extracting text for a presentation file");
    }
}
