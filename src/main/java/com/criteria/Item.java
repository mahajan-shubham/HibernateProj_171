package com.criteria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int itemId;
private String itemName;
private int qunt;
private int price;
private String category;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item( String itemName, int qunt, int price, String category) {
	super();
	
	this.itemName = itemName;
	this.qunt = qunt;
	this.price = price;
	this.category = category;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQunt() {
	return qunt;
}
public void setQunt(int qunt) {
	this.qunt = qunt;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
