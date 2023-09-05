package model.apps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.App;
import model.entities.Page;

public class InternetBrowser implements App<Page>{
	
	Map<String, Page> pages = new HashMap<>();
	
	
//	displayPage, addNewTab, refreshPage
	
//	public void addNewTab (String name) {
//		pages.put(name, new Page())
//	}
	
	
	
	@Override
	public void start() {
		System.out.println("Starting Internet Browser.");
	}

	@Override
	public void close() {
		System.out.println("Closing Internet Browser.");
	}

	@Override
	public boolean isMapped(Page obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
