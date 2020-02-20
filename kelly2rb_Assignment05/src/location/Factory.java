/*
 * Name: Rob Kelly
 * Email: kelly2rb@mail.uc.edu
 * Course: IT2045C
 * Assignment #: 05
 * Due Date: 2/20/2020
 * Citations: N/A
 * Anything else: N/A
*/
package location;

import device.Conveyer;
import device.Motor;
import device.Pump;

public class Factory {
	private Motor motor1;
	private Pump pump1;
	private Conveyer conveyer1;

	/***
	 * Constructor for Factory Object
	 * 
	 * @param motor1    The Motor
	 * @param pump1     The Pump
	 * @param conveyer1 The Conveyer
	 */
	public Factory(Motor motor1, Pump pump1, Conveyer conveyer1) {
		setMotor1(motor1);
		setPump1(pump1);
		setConveyer1(conveyer1);
	}

	/***
	 * Get the Motor
	 * 
	 * @return The Motor
	 */
	public Motor getMotor1() {
		return motor1;
	}

	/***
	 * Set the Motor
	 * 
	 * @param motor1 The Motor
	 */
	public void setMotor1(Motor motor1) {
		this.motor1 = motor1;
	}

	/***
	 * Get the Pump
	 * 
	 * @return The Pump
	 */
	public Pump getPump1() {
		return pump1;
	}

	/***
	 * Set the Pump
	 * 
	 * @param pump1 The Pump
	 */
	public void setPump1(Pump pump1) {
		this.pump1 = pump1;
	}

	/***
	 * Get the Conveyer
	 * 
	 * @return The Conveyer
	 */
	public Conveyer getConveyer1() {
		return conveyer1;
	}

	/***
	 * Set the Conveyer
	 * 
	 * @param conveyer1 The Conveyer
	 */
	public void setConveyer1(Conveyer conveyer1) {
		this.conveyer1 = conveyer1;
	}

	/***
	 * toString, represents Factory as a String
	 */
	public String toString() {
		return "Motor: \n" + motor1.toString() + "\n\nPump: \n" + pump1.toString() + "\n\nConveyer: \n"
				+ conveyer1.toString();
	}
}
