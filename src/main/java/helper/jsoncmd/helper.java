package helper.jsoncmd;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class helper extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new MyListenner(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
