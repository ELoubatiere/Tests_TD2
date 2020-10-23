package calculator;

import java.util.HashSet;
import java.util.Set;


/**
 * @author JustALaptop
 *
 */
public class Calculator {

	/**
	 * @param args
	 */

	public int add(int a, int b)
	{
		return a + b;
	}

	public int multiply(int a, int b)
	{
		return a * b;
	}

	public void longCalculation() { // Fonction trop longue
		try {
			Thread.sleep(500); // Simuler une fonction longue à éxec sans devoir la remplir nous-même
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Set<Integer> digitsSet(int number) {
		Set<Integer> integers = new HashSet<Integer>();
		String numberString = String.valueOf(number);
		for (int i = 0; i < numberString.length(); i++) {
			if (numberString.charAt(i) != '-') {
				integers.add(Integer.parseInt(numberString, i, i + 1, 10));
			}
		}
		return integers;
	}

	public double add(double a, double b) {
		return a + b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}

}
