package com.example.demo;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useRecursion("abc", 1, 4);
	}

	public static int useRecursion(String someString, int i, int index) {

		if (index >= someString.length()) {
			return 1;
		}

		int count = someString.charAt(index) == i ? 1 : 0;
		return count + useRecursion(someString, i, index + 1);

	}
}
