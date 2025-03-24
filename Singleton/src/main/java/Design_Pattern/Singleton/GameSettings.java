package Design_Pattern.Singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GameSettings {
    private static final GameSettings INSTANCE = new GameSettings();

    private int volume = 50;
    @Setter
    private String resolution = "1920x1080";

    private GameSettings() {}

    public static GameSettings getInstance() {
        return INSTANCE;
    }

    public void setVolume(int level) {
        if (level >= 0 && level <= 100) {
            this.volume = level;
        }
    }
}