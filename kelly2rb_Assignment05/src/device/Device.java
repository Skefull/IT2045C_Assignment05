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

public class Device {
	private String partNumber;
	private String sku;
	private boolean onOrOff;

	/***
	 * Constructor for object Device
	 * 
	 * @param partNumber The part number
	 * @param sku        The SKU
	 */
	public Device(String partNumber, String sku) {
		setOnOrOff(false);
		setPartNumber(partNumber);
		setSku(sku);
	}

	/***
	 * Get the part number
	 * 
	 * @return The part number
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/***
	 * Set the part number
	 * 
	 * @param partNumber The part number
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/***
	 * Get the SKU
	 * 
	 * @return The SKU
	 */
	public String getSku() {
		return sku;
	}

	/***
	 * Set SKU
	 * 
	 * @param sku The SKU
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/***
	 * Determine if object is On or Off
	 * 
	 * @return If object is On or off
	 */
	public boolean isOnOrOff() {
		return onOrOff;
	}

	/***
	 * Set device as on or off
	 * 
	 * @param onOrOff Device is on or off
	 */
	public void setOnOrOff(boolean onOrOff) {
		this.onOrOff = onOrOff;
	}

	/***
	 * toString. Represents object as a String.
	 */
	public String toString() {
		return "Part Number: " + partNumber + "\nSKU: " + sku + "\nOn(true) or Off(false): " + onOrOff;
	}
}
