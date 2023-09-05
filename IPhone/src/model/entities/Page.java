package model.entities;

public class Page {
	String url;
	String content;

	public Page(String url, String content) {
		this.url = url;
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Page [ url = " + url + " ] \n"
				+ "content: \n" + content;
	}

}
