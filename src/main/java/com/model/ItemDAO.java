package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ItemDAO {
	
	
	public void saveItem(Item item);
	public List<Item> findAllItem();
	public Item findItem(int id);
	public boolean update(Item item);
	public boolean delte(Item item);

}
