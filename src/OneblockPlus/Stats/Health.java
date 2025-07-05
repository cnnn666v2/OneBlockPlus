package OneblockPlus.Stats;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

public class Health {
    public static void setMaxHealth(Player p, int health) {
        p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(health);
    }

    public static int getMaxHealth(Player p) {
        double health = p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue();
        return (int) health;
    }
}
