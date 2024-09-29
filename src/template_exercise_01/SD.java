package template_exercise_01;

public class SD extends VideoRenderingQuality{

    protected void applyColorCorrection() {
        System.out.println("Applying black and white colors");
    }

    @Override
    protected String renderVideo() {
        return "SD";
    }
}
