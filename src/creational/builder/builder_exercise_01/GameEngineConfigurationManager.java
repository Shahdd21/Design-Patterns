package creational.builder.builder_exercise_01;

public interface GameEngineConfigurationManager {
    GameEngineConfigurationManager setGraphicsQuality(String graphicsQuality);
    GameEngineConfigurationManager setSoundOptions(String soundOptions);
    GameEngineConfigurationManager setControlPreferences(String controlPreferences);
}
