package creational.prototype_exercise;

public class Button implements GuiComponents{
    private double xPosition;
    private double yPosition;
    private String color;
    private String content;

    public Button(double xPosition, double yPosition, String content, String color) {
        this.xPosition = xPosition;
        this.content = content;
        this.color = color;
        this.yPosition = yPosition;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println("X position: " + getxPosition());
        System.out.println("Y position: " + getyPosition());
        System.out.println("Content: " + getContent());
        System.out.println("Color: " + getColor());
    }

    @Override
    public Button clone() {
       return new Button(this.getxPosition(),this.getyPosition(),this.getContent(),this.getColor());
    }
}
