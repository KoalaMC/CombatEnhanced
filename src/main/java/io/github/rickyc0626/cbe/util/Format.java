package io.github.rickyc0626.cbe.util;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class Format
{
    public static String toColor(String text) { return ChatColor.translateAlternateColorCodes('&', text); }

    public static List<String> toColor(List<String> texts)
    {
        List<String> lore = new ArrayList<>();

        for(String s : texts)
        {
            lore.add(toColor(s));
        }
        return lore;
    }
}
