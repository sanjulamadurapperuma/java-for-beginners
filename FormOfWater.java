/**
 * @author Sanjula
 *
 */

import java.util.Scanner;

public class Exercise3_10 {
	public static void main(String[] args) {
		final int CELCIUS_FPOINT = 0;
		final int FAHRENHEIT_FPOINT = 32;
		double celcius_bpoint = 100;
		double fahrenheit_bpoint = 212;
		
		System.out.print("Enter the temperature type ('C' OR 'F'): ");
		Scanner scanner = new Scanner(System.in);
		String temp_type = scanner.next();
		System.out.print("Enter the temperature value: ");
		double temp_value = scanner.nextDouble();
		System.out.print("Enter the altitude type ('M' or 'F'): ");
		String alt_type = scanner.next();
		System.out.println("Enter the altitude value: ");
		double alt_value = scanner.nextDouble();
		scanner.close();
		
		if (temp_type.equals("C")) {
			if (alt_type.equals("M")) {
				celcius_bpoint -= (alt_value / 300);
			}
			else {
				celcius_bpoint -= (alt_value / 1000);
			}
			
			if (temp_value <= CELCIUS_FPOINT) {
				System.out.println("Water is solid");
			}
			else if (temp_value > celcius_bpoint) {
				System.out.println("Water is gaseous");
			}
			else {
				System.out.println("Water is liquid");
			}
		}
		else if (temp_type.equals("F")) {
			if (alt_type.equals("M")) {
				fahrenheit_bpoint -= (alt_value / 300);
			}
			else {
				fahrenheit_bpoint -= (alt_value / 1000);
			}
			
			if (temp_value <= FAHRENHEIT_FPOINT) {
				System.out.println("Water is solid");
			}
			else if (temp_value > fahrenheit_bpoint) {
				System.out.println("Water is gaseous");
			}
			else {
				System.out.println("Water is liquid");
			}
		}
	}
}
