package com.prang.scm.assignment3.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.prang.scm.assignment3.SieveOfErasthones;


public class SieveOfErasthonesTest {
	
	@Test
	public void testComputePrimes() {
		int n = 10;
		List<Integer> primes = new SieveOfErasthones().computePrimes(n);
		System.out.println(primes);
		assertTrue(primes.contains(8));
	}

}
