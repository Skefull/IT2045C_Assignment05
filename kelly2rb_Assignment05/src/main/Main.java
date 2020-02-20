/*
 * Name: Rob Kelly
 * Email: kelly2rb@mail.uc.edu
 * Course: IT2045C
 * Assignment #: 05
 * Due Date: 2/20/2020
 * Citations: N/A
 * Anything else: N/A
*/
package main;

import device.Conveyer;
import device.Motor;
import device.Pump;
import location.Factory;

public class Main {

	public static void main(String[] args) {
		Motor motor = new Motor("64MM3M", "TV415MRW", 1000);
		Pump pump = new Pump("98C14", "KS944RUR", (float) 280.6);
		Conveyer conveyer = new Conveyer("3294F", "MN899OPM", 27);
		Factory factory = new Factory(motor, pump, conveyer);
		System.out.println(factory.toString());
	}

}
