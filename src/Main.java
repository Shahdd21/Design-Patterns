import template_exercise_02.*;

public class Main {
    public static void main(String[] args) {
        String message = "This is plain text";

        Formatter json = new JsonFormatter();
        json.format(message);

        Formatter xml = new XmlFormatter();
        xml.format(message);
    }
}