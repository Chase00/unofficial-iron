package com.unofficialiron;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class UnofficialIronTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(UnofficialIronPlugin.class);
		RuneLite.main(args);
	}
}