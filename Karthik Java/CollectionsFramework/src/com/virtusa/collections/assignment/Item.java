package com.virtusa.collections.assignment;

import java.util.TreeSet;

public class Item implements Comparable<Item> {
	
	private long itemId;
	private String itemName;
	private float itemPrice;
	
	

	public Item(long itemId, String itemName, float itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		if(this.itemId > o.itemId) {
			return 1;
		}
		if(this.itemId < o.itemId) {
			return -1;
		}
		if(this.itemId == o.itemId) {
			return 0;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Item> items  = new TreeSet<Item>();
		items.add(new Item(923456789L,"Mobile",30000.65f));
		items.add(new Item(563456789L,"TV",54000.45f));
		items.add(new Item(985632741L,"Computer",40000.65f));
		
		System.out.println(items);

	}
	
	
	
	

}
