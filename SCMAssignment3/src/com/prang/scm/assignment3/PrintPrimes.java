package com.prang.scm.assignment3;

import java.util.List;

public class PrintPrimes {

	public static void main(String[] args) {
		try {
			SieveOfErasthones sieve = new SieveOfErasthones();
			List<Integer> primes = sieve.computePrimes(Integer.parseInt(args[0]));
			System.out.println("Prime number from 2 to "+ args[0] +" are ");
			System.out.println(primes);
		}catch(NumberFormatException nfe ) {
			System.out.println("Please enter positive integer numbers only");
			throw nfe;
		}
	}

}
