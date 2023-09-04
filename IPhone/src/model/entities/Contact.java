package model.entities;

public class Contact {

	String name;
	Integer number;

	public Contact(String name, Integer number) {
		this.name = name;
		this.number = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "[ name = " + name + ", number = " + number + " ] ";
	}

}
