package behavioral.memento_exercise;

public class DrawingApplication {
    private String content;
    private String color;
    private String border;

    public DrawingApplication() {
        this.border = "";
        this.color = "";
        this.content = "";
    }

    public DrawingState save(){
        return new DrawingState(content,color,border);
    }

    public void restore(DrawingState drawingState){
        this.content = drawingState.getContent();
        this.color = drawingState.getColor();
        this.border = drawingState.getBorder();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }
}
