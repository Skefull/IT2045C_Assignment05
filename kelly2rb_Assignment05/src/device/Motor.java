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

public class Motor extends Device {
	private int maxRpm;

	/***
	 * Constructor class for object Device
	 * 
	 * @param partNumber The part number
	 * @param sku        The SKU
	 * @param maxRpm     The max RPM
	 */
	public Motor(String partNumber, String sku, int maxRpm) {
		super(partNumber, sku);
		setPartNumber(partNumber);
		setSku(sku);
		setMaxRpm(maxRpm);
		setOnOrOff(false);

	}

	/***
	 * Get the max RPM
	 * 
	 * @return The max RPM
	 */
	public int getMaxRpm() {
		return maxRpm;
	}

	/***
	 * Set the max RPM
	 * 
	 * @param maxRpm The max RPM
	 */
	public void setMaxRpm(int maxRpm) {
		this.maxRpm = maxRpm;
	}

	/***
	 * Set the max RPM; Defaults the RPM for the motor object.
	 */
	public void setMaxRpm() {

	}

	/***
	 * toString. Represents object as a String.
	 */
	public String toString() {
		return super.toString() + "\nMax RPM: " + maxRpm + " RPM";
	}
}
