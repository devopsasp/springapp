package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	@Autowired
	ItemDAO itemDAOImpl;
	public void save(Item item)
	{
		itemDAOImpl.saveItem(item);
	}

}
