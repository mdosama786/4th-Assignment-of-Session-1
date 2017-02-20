// Converting ASCII Values to character value.

public class Asciitochar {

	// Main Method
	public static void main(String[] args) {

		// using for loop
		for (int i = 65; i <= 90; i++) {

			int ascii = i;         // Declare integer variables ascii and assign into (i)		
			char A = (char) ascii; // Declares Character variables

			// print the output
			System.out.println(i + "-" + A);
		}
	}
}