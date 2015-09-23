package org.airline.reservations;

public class Passenger {

	//fields
	private String name; //Passenger name
	
	//constructor
	public Passenger() {
		name = "Unknown name";
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
}
