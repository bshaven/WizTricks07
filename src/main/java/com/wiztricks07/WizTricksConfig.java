package com.wiztricks07;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface WizTricksConfig extends Config
{
	@ConfigItem(
		keyName = "wiztricks",
		name = "WizTrick07",
		description = "WizTricks07 - Helpful things for OSRS!"
	)
	default String greeting()
	{
		return "Thank you for installing my plugin.. Enjoy!";
	}
}
