package visitor_exercise;

public class CountingWords implements editorVisitor{
    @Override
    public void visit(textFile file) {
        System.out.println("Counting words for a text file");
    }

    @Override
    public void visit(spreadSheet sheet) {
        System.out.println("Counting words for a spread sheet");
    }

    @Override
    public void visit(presentationFile presentation) {
        System.out.println("Counting words for a presentation file");
    }
}
