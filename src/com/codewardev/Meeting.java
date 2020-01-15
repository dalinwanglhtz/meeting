package com.codewardev;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java

public class Meeting {

	public static String meeting(String s) {
		return Arrays.stream(s.split(";")).map(x->{
			String[] name = x.split(":");
			return String.join(":", name[1], name[0]);
		})
		.map(String::toUpperCase)
		.sorted()
		.map(x->{
			String[] name = x.split(":");
			return "("+name[0]+", "+name[1]+")";
		})
		.collect(Collectors.joining());
	}

}
