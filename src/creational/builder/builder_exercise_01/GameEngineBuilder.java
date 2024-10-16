package creational.builder.builder_exercise_01;

public class GameEngineBuilder implements GameEngineConfigurationManager{

    private String graphicsQuality;
    private String soundOptions;
    private String controlPreferences;

    @Override
    public GameEngineBuilder setGraphicsQuality(String graphicsQuality) {
        this.graphicsQuality = graphicsQuality;
        return this;
    }

    @Override
    public GameEngineBuilder setSoundOptions(String soundOptions) {
        this.soundOptions = soundOptions;
        return this;
    }

    @Override
    public GameEngineBuilder setControlPreferences(String controlPreferences) {
        this.controlPreferences = controlPreferences;
        return this;
    }

    public GameEngine build(){
        return new GameEngine(this);
    }

    public String getGraphicsQuality() {
        return graphicsQuality;
    }

    public String getControlPreferences() {
        return controlPreferences;
    }

    public String getSoundOptions() {
        return soundOptions;
    }
}
