package com.example.demo;

import java.util.Arrays;

class Test {

	  public static void main(String args[]) {
		useRecursion("dfds", 0, 0);
		
	}

	public static int useRecursion(String someString, int i, int index) {

		if (index >= someString.length()) {
			return 1;
		}

		int count = someString.charAt(index) == i ? 1 : 0;
		return count + useRecursion(someString, i, index + 1);

	}
}
