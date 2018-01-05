package org.spencer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] arr = {"Spencer", "Jinwoo", "Minwoo", "Christina"}; 
		
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int n = Arrays.binarySearch(arr, "Jinwoo");
		System.out.println(n);
	
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		System.out.println("* " + stooges.getClass().getModifiers());

		Collections.sort(stooges);
		System.out.println(stooges);

		String[] sarr = stooges.toArray(new String[stooges.size()]);
		System.out.println(Arrays.toString(sarr));
	}

}
