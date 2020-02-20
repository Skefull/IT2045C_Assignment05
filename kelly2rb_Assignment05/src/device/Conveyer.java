/*
 * Name: Rob Kelly
 * Email: kelly2rb@mail.uc.edu
 * Course: IT2045C
 * Assignment #: 05
 * Due Date: 2/20/2020
 * Citations: N/A
 * Anything else: N/A
*/
package device;

public class Conveyer extends Device {
	private int speed;

	/***
	 * The Constructor for Conveyer Object
	 * 
	 * @param partNumber The part number
	 * @param sku        The SKU
	 * @param speed      The speed
	 */
	public Conveyer(String partNumber, String sku, int speed) {
		super(partNumber, sku);
		setPartNumber(partNumber);
		setSku(sku);
		setOnOrOff(false);
		setSpeed(speed);
	}

	/***
	 * Get the speed
	 * 
	 * @return The speed
	 */
	public int getSpeed() {
		return speed;
	}

	/***
	 * Set the speed
	 * 
	 * @param speed The speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/***
	 * toString. Represents Conveyer as a String.
	 */
	public String toString() {
		return super.toString() + "\nSpeed: " + speed + " feet per second";
	}
}
