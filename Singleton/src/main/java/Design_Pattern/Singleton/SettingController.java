package Design_Pattern.Singleton;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
public class SettingController {

    private final GameSettings gameSettings = GameSettings.getInstance();

    @PostMapping("/volume")
    public String setVolume(@RequestParam int level) {
        gameSettings.setVolume(level);
        return "Volume set to: " + level;
    }

    @PostMapping("/resolution")
    public String setResolution(@RequestParam String res) {
        gameSettings.setResolution(res);
        return "Resolution set to: " + res;
    }

    @GetMapping
    public String getSettings() {
        return String.format("Current Settings - Volume: %d%%, Resolution: %s",
                gameSettings.getVolume(),
                gameSettings.getResolution());
    }
}