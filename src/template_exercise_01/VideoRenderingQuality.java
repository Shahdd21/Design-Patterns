package template_exercise_01;

public abstract class VideoRenderingQuality {

    public final void getVideo(){
        enhanceVideoQuality();
        applyColorCorrection();
        enhanceAudioQuality();
        applyFilters();
        System.out.println(renderVideo());
    }

    private void enhanceAudioQuality() {
        System.out.println("Enhancing audio quality...");
    }

    private void enhanceVideoQuality(){
        System.out.println("Enhancing video quality...");
    }

    protected abstract void applyColorCorrection();

    private void applyFilters(){
        System.out.println("Applying some filters...");
    }

    protected abstract String renderVideo();
}
