package com.example.demo.controller;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String name = "sardarshaikhss";
		System.out.println(" Max repeating character in given String :: " + findMaxOcuuraingChar(name));
	}

	static char findMaxOcuuraingChar(String name) {
		HashMap<Character, Integer> map = new HashMap<>();

		int n = name.length();

		char ans = 0;

		int count = 0;

		for (int i = 0; i < n; i++) {
			char c = name.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			if (count < map.get(c)) {
				ans = c;
				count = map.get(c);
			}
		}
		return ans;

	}
}
