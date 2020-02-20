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

public class Pump extends Device {
	private float maxFlowRate;

	/***
	 * Constructor for Pump Object
	 * 
	 * @param partNumber  The part number
	 * @param sku         The SKU
	 * @param maxFlowRate The Max Flow Rate
	 */
	public Pump(String partNumber, String sku, float maxFlowRate) {
		super(partNumber, sku);
		setPartNumber(partNumber);
		setSku(sku);
		setMaxFlowRate(maxFlowRate);
		setOnOrOff(false);
	}

	/***
	 * Get the max flow rate
	 * 
	 * @return The max flow rate
	 */
	public float getMaxFlowRate() {
		return maxFlowRate;
	}

	/***
	 * Set the max flow rate
	 * 
	 * @param maxFlowRate The max flow rate
	 */
	public void setMaxFlowRate(float maxFlowRate) {
		this.maxFlowRate = maxFlowRate;
	}

	/***
	 * toString. Represents Object as a String.
	 */
	public String toString() {
		return super.toString() + "\nMax Flow Rate: " + maxFlowRate + " gallons per minute";
	}
}
