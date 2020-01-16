package com.codewardev;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java

public class Meeting {

	public static String meeting(String s) {
		return Arrays.stream(s.split(";")).map(x->{
			String name = x.replaceAll("(\\w+):(\\w+)", "$2:$1");
			return name;
		})
		.map(String::toUpperCase)
		.sorted()
		.map(x->{
			Matcher m = Pattern.compile("(\\w+)(:)(\\w+)").matcher(x);
			return m.find()?"("+m.group(1)+", "+m.group(3)+")":x;
		})
		.collect(Collectors.joining());
	}

}
