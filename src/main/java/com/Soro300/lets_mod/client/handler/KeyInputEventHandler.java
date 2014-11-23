package com.Soro300.lets_mod.client.handler;

import com.Soro300.lets_mod.client.settings.Keybindings;
import com.Soro300.lets_mod.reference.Key;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	
	private static Key getPressedKeyBinding() {
		if (Keybindings.charge.isPressed()) {
			return Key.CHARGE;
		}
		else if (Keybindings.release.isPressed()) {
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
		
	}
	

}
