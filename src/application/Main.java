package application;

public class Main {

	public static void main(String[] args) {

		Coupler coupler = new Coupler();
		Integer[] binaries = new Integer[5];

		// Check number of command line arguments
		if (args.length == 6) {
			// Loop through binary values (command line arguments 1 through 5)
			for (int i = 1; i <= 5; i++) {
				if (Validator.isBinaryDigit(args[i])) {
					// Populate array with binary values (index offset -1)
					binaries[i - 1] = Integer.parseInt(args[i]);
				} else {
					System.out.println("Invalid binary argument: " + args[i]);
					System.exit(1);
				}
			}
		} else {
			// Too many or too few command line arguments
			System.out.println("Invalid number of arguments");
			System.exit(1);
		}

		// Validate coupling operation selection
		if (args[0].equals("1")) {

			// Apply Coupling #1 rule
			Coupleable c = b -> (b[0] & b[1]) | b[2] | (b[3] ^ b[4]);
			System.out.println(coupler.apply(c, binaries));

		} else if (args[0].equals("2")) {

			// Apply Coupling #2 rule (two distinct output values)
			Coupleable c1 = b -> (b[0] & b[1]) ^ 1 | (b[2] ^ b[3]);
			Coupleable c2 = b -> (b[2] ^ b[3]) & b[4];
			int out1 = coupler.apply(c1, binaries);
			int out2 = coupler.apply(c2, binaries);
			System.out.print(out1 + " " + out2);

		} else {
			// No valid coupling operation passed
			throw new IllegalArgumentException("Invalid operation argument: " + args[1]);
		}

	}

}
