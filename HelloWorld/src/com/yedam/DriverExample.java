package com.yedam;

import java.util.Scanner;

class Driver {
	void dirve(Vehicle vehicle) {
		vehicle.run();

	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver diver = new Driver();
		Vehicle vehicle = new Vehicle();
		Scanner sc = new Scanner(System.in);

		vehicle = new bus();
		vehicle = new taxi();

		diver.dirve(vehicle);
	}
}
