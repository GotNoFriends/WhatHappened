package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "")
public class Command_shadoweracore extends BukkitCommand<ShadowEra>
{

    @Override
    public boolean run(CommandSender sender, Command command, String commandLabel, String[] args)
    {      
        sender.sendMessage("This is for the plugin");
        sender.sendMessage("This is a test command");
        sender.sendMessage("Why are you here?");
        return true;

    }

}