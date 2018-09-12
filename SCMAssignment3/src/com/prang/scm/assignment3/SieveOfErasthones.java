package com.prang.scm.assignment3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Print all the prime numbers smaller than or equal to 'n'
 */
public class SieveOfErasthones {
	
		
	public List<Integer> computePrimes(int n) {
		
	    System.out.println("Auto build checking 2");		
	    boolean prime[] = new boolean[n + 1];
	    Arrays.fill(prime, true);
	    for (int p = 2; p * p <= n; p++) {
	        if (prime[p]) {
	            for (int i = p * 2; i <= n; i += p) {
	                prime[i] = false;
	            }
	        }
	    }
	    List<Integer> primeNumbers = new LinkedList<>();
	    for (int i = 2; i <= n; i++) {
	        if (prime[i]) {
	            primeNumbers.add(i);
	        }
	    }
	    return primeNumbers;
	}
	
	public static void main (String args[]) {
		new SieveOfErasthones().computePrimes(10);
	}
	

}
