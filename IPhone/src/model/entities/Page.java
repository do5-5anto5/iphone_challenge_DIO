package model.entities;

public class Page {
    String url;

	public Page(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Page [ url = " + url + " ] ";
	}
	
	
    
    
}
