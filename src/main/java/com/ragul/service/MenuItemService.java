package com.ragul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragul.model.Menu;
import com.ragul.repository.MenuRepository;


@Service
public class MenuItemService  {
	
	@Autowired
	MenuRepository mr;
	
	public void setMenu(Menu menu){
		mr.save(menu);
	}
	
	public List<Menu> getMenuAdmin(){
		return mr.findAll();
	}
	
	public List<Menu> getMenuListCustomer(){
		return mr.findAll();
	}
	
	public Menu getMenu(long id) {
		return mr.findById(id).get();
	}
	
	public void editMenu(Menu menu) {
		mr.save(menu);
	}
	
	
}
