package com.sherybedrock.examples;

public class ReverseStringRecursion {
	public static void main(String... args) {
		String originalString = "sherybedrock";

		System.out.println("Original String: " + originalString);
		System.out.print("Reversed String: ");
		reverseRecursively(originalString);
	}

	public static void reverseRecursively(String str) {

		if (str.length() == 1) {
			System.out.print(str);
		} else {
//			System.out.println(str);
			reverseRecursively(str.substring(1, str.length()));
			System.out.print(str.substring(0, 1));
		}
	}
}