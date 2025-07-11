package OneblockPlus;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

public class PlayerCache {
    private final ConcurrentHashMap<Player, int[]> players = new ConcurrentHashMap<>();

    public void updateCache(Collection<? extends Player> onlinePlayers) {
        players.clear();
        onlinePlayers.forEach(player -> {
        	final UUID uuid = player.getUniqueId();
        	final int plID = PlayerInfo.GetId(uuid);
        	if (plID == -1)
        		return;
        	players.put(player, Oneblock.plugin.getFullCoord(plID));
        });
    }
    
    public Collection<Player> getPlayers() {
        return players.keySet();
    }

    public int[] getFullCoord(Player player) {
        return players.get(player);
    }
}
