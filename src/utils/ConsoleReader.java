package utils;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleReader {
private static Scanner in = new Scanner(new InputStreamReader(System.in));

public static String promptString(String prompt) {
	System.out.println(prompt);
	return in.next();
}

public static String promptOneOf(String category, String[] choices) {
	final String FULL_PROMPT = String.format("%s: Choose one of the following: %s", category,Arrays.toString(choices));
	String result;
	do {
		result = promptString(FULL_PROMPT);
	} while (!Arrays.asList(choices).contains(result));
	return result;
}
}
