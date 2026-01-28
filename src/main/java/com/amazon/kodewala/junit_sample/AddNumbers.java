package com.amazon.kodewala.junit_sample;

public class AddNumbers {

	public static boolean allZeroes(Integer[] num) {
		for (Integer i : num) {
			if (!(i == 0)) {
				return false;
			}
		}
		return true;
	}

	public int addNumbers(Integer... i) {
		Integer result = 0;
		if (AddNumbers.allZeroes(i)) {
			return result;
		}
		for (Integer num : i) {
			result += num;
		}
		return result;
	}

}
