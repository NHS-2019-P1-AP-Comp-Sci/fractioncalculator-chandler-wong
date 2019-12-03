/**
 * @author Mr. Rasmussen
 */
package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		while (quit == false) {
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("quit!");
				scan.close();
				quit = true;
			} else {
				String answer = produceAnswer(input);
				System.out.println(answer);
			}
		}
	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		// TODO: Implement this function to produce the solution to the input
		int space = input.indexOf(" ");
		String operand1 = input.substring(0, space);
		String operator = input.substring(space + 1, space + 2);
		String operand2 = input.substring(space + 3);
		int underscore2 = operand2.indexOf("_");
		int slash2 = operand2.indexOf("/");
		String operand2Whole = "Oops";
		String operand2Numerator = "Oops";
		String operand2Denominator = "Oops";
		if (!(underscore2 == -1)){
			operand2Whole = operand2.substring(0, underscore2);
			operand2Whole = "whole:" + operand2Whole;
			operand2Numerator = operand2.substring(underscore2+1,slash2);
			operand2Numerator = "numerator:" + operand2Numerator;
			operand2Denominator = operand2.substring(slash2 + 1);
			operand2Denominator = "denominator:" + operand2Denominator;
		} else if (slash2 == -1){
			operand2Whole = operand2;
			operand2Whole = "whole:" + operand2Whole;
			operand2Numerator = "numerator:0";
			operand2Denominator = "denominator:1";
		} else {
			operand2Whole = "whole:0";
			operand2Numerator = operand2.substring(underscore2+1,slash2);
			operand2Numerator = "numerator:" + operand2Numerator;
			operand2Denominator = operand2.substring(slash2 + 1);
			operand2Denominator = "denominator:" + operand2Denominator;
		}
		String Checkpoint2 = operand2Whole + " " + operand2Numerator + " " + operand2Denominator;
		
		return Checkpoint2;
	}

	// TODO: Fill in the space below with any helper methods that you think you will
	// need

}
