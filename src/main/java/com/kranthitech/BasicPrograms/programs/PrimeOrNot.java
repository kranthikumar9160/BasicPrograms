package com.kranthitech.BasicPrograms.programs;

public class PrimeOrNot {
	public static void main(String[] args) {

		int n = 100;

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not a prime");
		}
	}
}
