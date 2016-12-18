//Problem Source: https://www.reddit.com/r/dailyprogrammer/comments/5hy8sm/20161212_challenge_295_easy_letter_by_letter/

import java.lang.String; 
import java.util.Scanner;

public class Easy_295 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first sentence: ");
		String input = sc.nextLine();

		System.out.print("Input second sentence: ");
		String output = sc.nextLine();

		sc.close(); 
		if(input.length() != output.length()) {
			System.out.println("The sentence lenghts must be the same");
		}
		else 
			Letter_by_Letter(input, output);
	}

	public static void Letter_by_Letter(String input, String output) {
		char[] input_array = input.toCharArray();
		char[] output_array = output.toCharArray();
		String out = "";
		String temp = "";
		System.out.println(input_array); 	
		for(int i = 0; i < input_array.length; i++) {
			if(input_array[i] != output_array[i]) {
				input_array[i] = output_array[i];
				out = new String(input_array);
				System.out.println(out);
			}
			if(out.equals(output)) 
				break;
		}
	}
} 
