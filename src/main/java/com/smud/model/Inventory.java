package com.smud.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}
}