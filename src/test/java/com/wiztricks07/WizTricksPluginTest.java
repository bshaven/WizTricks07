package com.wiztricks07;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class WizTricksPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WizTricksPlugin.class);
		RuneLite.main(args);
	}
}