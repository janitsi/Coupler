package application;

public class Coupler {
	/**
	 * Function to perform coupling with provided coupler and binaries
	 */
	public int apply(Coupleable coupler, Integer...binaries) {

		return coupler.apply(binaries);
	}
}
