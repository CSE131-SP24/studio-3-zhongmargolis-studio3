package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Choose an N: ");
		int number = scan.nextInt();
		
		boolean[] listofall = new boolean[number+1];
		
		for (int i = 0; i < listofall.length; i++) {
			listofall[i] = true;
		}
		
		for (int factor = 2; factor < listofall.length; factor++) {
			if (listofall[factor]) {
				for (int p = factor*2; p <= number; p=p+factor) {
					listofall[p] = false;
				}
			}
		}
		
		for (int i = 0; i < listofall.length; i++) {
			if (listofall[i]) {
				System.out.println(i);
			}
		}

	}

}