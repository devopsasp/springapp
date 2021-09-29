package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.model.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
    @GetMapping("/")
    @ResponseBody
   public String getMessage()
   {
    	itemService.save(new Item());
    	
		return "Hello World";
   }
    
    
}
