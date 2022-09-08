package test;
//  longest word in file
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Longest_word {
	public static void main(String[] args) throws FileNotFoundException {
		new Longest_word().getLongestWords();
	}

	public String getLongestWords() throws FileNotFoundException {

		String longestWord = "";
		String current;
		Scanner scan = new Scanner(new File("C:\\Users\\ALTAF ALI\\Desktop\\Chetan Bhagat.txt"));

		while (scan.hasNext()) {
			current = scan.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}
		}
		System.out.println(longestWord);
		return longestWord;
	}

}