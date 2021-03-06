package network.warzone.manager.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jorge on 4/25/2018.
 */
public class ForumsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(new ComponentBuilder("\nClick ").color(ChatColor.GREEN)
                    .append(new ComponentBuilder("here")
                            .color(ChatColor.AQUA)
                            .event(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://warzone.network/"))
                            .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click!").color(ChatColor.YELLOW).create())).create())
                    .append(new ComponentBuilder(" to go to our forums\n")
                            .reset().color(ChatColor.GREEN).create())
                    .create()); // Yes, this is the same code as the IssueCommand class
            return true;
        }

        sender.sendMessage(ChatColor.RED + "Only players may use this command.");
        return true;
    }
}
