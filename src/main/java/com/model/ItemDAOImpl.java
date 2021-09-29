package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveItem(Item item) {
		
   Session session=sessionFactory.openSession();
   Transaction tx=session.beginTransaction();
   session.save(item);
   session.flush();
   tx.commit();
		System.out.println("item saved");
		// TODO Auto-generated method stub

	}

	@Override
	public List<Item> findAllItem() {
		// TODO Auto-generated method stub
		return new ArrayList();
	}

	@Override
	public Item findItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delte(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

}
