package behavioral.template_exercise_01;

public class HD extends VideoRenderingQuality{

    protected void applyColorCorrection() {
        System.out.println("Applying grey color");
    }

    @Override
    protected String renderVideo() {
        return "HD";
    }
}
