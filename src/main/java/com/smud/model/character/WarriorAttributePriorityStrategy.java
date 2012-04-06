package com.smud.model.character;

import java.util.List;

public class WarriorAttributePriorityStrategy implements AttributePriorityStrategy {

	@Override
	public void distributeAttributes(Player player, List<Integer> attributes) {
		player.setStrength(attributes.remove(attributes.size() - 1));
		player.setDexterity(attributes.remove(attributes.size() - 1));
		player.setConstitution(attributes.remove(attributes.size() - 1));
		player.setWisdom(attributes.remove(attributes.size() - 1));
		player.setIntelligence(attributes.remove(attributes.size() - 1));
		player.setCharisma(attributes.remove(attributes.size() - 1));
	}


}