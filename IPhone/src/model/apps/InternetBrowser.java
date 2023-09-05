package model.apps;

import java.util.HashMap;
import java.util.Map;

import model.App;
import model.entities.Page;

public class InternetBrowser implements App<Page> {

	Map<String, Page> pages = new HashMap<>();

//	refreshPage

	public void addNewTab(String name, String url, String content) {
		pages.put(name, new Page(url, content));
	}

	public void displayPage(String name) {
		if (isMapped(pages.get(name))) {
			System.out.println(name + " " + pages.get(name) + "\n");
			simulateTimeCharge();
		} else {
			System.out.println("No pages in browser.");
			simulateTimeCharge();
		}
	}

	public void refreshPage(String name) {
		simulateTimeCharge();
		System.out.println("\n \nRefreshing page\n");				
		simulateTimeCharge();
		simulateTimeCharge();				
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		simulateTimeCharge();
		displayPage(name);
	}

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
		return pages.containsValue(obj);
	}

}
