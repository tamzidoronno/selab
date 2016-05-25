package javaproject;

public class practice {
	
	private String name;
	private String hall;
	private int i;
	
	
	public practice(String name, int i) {
		super();
		this.name = name;
		this.i = i;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHall() {
		return hall;
	}


	public void setHall(String hall) {
		this.hall = hall;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public practice(String name, String hall, int i) {
		super();
		this.name = name;
		this.hall = hall;
		this.i = i;
	}
	

}
