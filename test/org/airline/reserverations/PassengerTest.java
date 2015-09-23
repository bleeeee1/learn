package org.airline.reserverations;

import static org.junit.Assert.*;

import org.airline.reservations.Passenger;
import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
		Passenger testPassenger1 = new Passenger();
		String result = testPassenger1.getName();
		assertEquals("Unknown name", result);
		
	}

	@Test
	public void testSetName() {
		Passenger testPassenger2 = new Passenger();
		testPassenger2.setName("My SetName");
		assertEquals("My SetName", testPassenger2.getName());
	}

}
