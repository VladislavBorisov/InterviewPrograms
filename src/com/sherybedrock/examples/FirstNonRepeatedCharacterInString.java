package com.sherybedrock.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {

		String inputString = "sherybedrock";
		System.out.println("The first non repeated character in inputString(" + inputString + ") is: "
				+ firstNonRepeatedCharacter(inputString));
	}

	public static Character firstNonRepeatedCharacter(String inputString) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char ar[] = inputString.toCharArray();
		char ch;

		for (int i = 0; i < ar.length; i++) {
			ch = ar[i];

			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		for (int i = 0; i < ar.length; i++) {
			ch = ar[i];
			if (map.get(ch) == 1)
				return ch;
			System.out.println(map.get(ch));
		}
		return null;
	}
}