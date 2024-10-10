package behavioral.template_exercise_01;

public class FHD extends VideoRenderingQuality{

    @Override
    protected void applyColorCorrection() {
        System.out.println("Applying black and blue colors");
    }

    @Override
    protected String renderVideo() {
        return "FHD";
    }
}
