package com.sherybedrock.examples;

import java.util.Scanner;

public class EmmaAndSquares {
//	HackerRank
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(getSquares(in.nextLong(), in.nextLong()));
		}
		in.close();
	}

	static long getSquares(long num1, long num2) {
		if (num1 == 0)
			num1++;
		Double x = Math.sqrt(num1);
		Double y = Math.sqrt(num2);
		long xLong = x.longValue();
		long yLong = y.longValue();
		long count = 0L;

		for (long i = xLong; i <= yLong; i++) {
			if ((i * i) <= num2 && (i * i) >= num1)
				count++;
		}

		return count;
	}
}