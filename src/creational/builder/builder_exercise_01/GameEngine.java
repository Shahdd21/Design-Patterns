package creational.builder.builder_exercise_01;

public class GameEngine {

    private final String graphicsQuality;
    private final String soundOptions;
    private final String controlPreferences;

    GameEngine(GameEngineBuilder gameEngineBuilder){
        this.graphicsQuality = gameEngineBuilder.getGraphicsQuality();
        this.soundOptions = gameEngineBuilder.getSoundOptions();
        this.controlPreferences = gameEngineBuilder.getControlPreferences();
    }

    public String getSoundOptions() {
        return soundOptions;
    }

    public String getControlPreferences() {
        return controlPreferences;
    }

    public String getGraphicsQuality() {
        return graphicsQuality;
    }
}
