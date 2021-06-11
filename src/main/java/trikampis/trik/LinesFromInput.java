package trikampis.trik;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class LinesFromInput extends Lines {
	
	public LinesFromInput() {
		super();
		readLinesFromInput();
	}
	
	public void readLinesFromInput() {
		Scanner in = new Scanner(System.in);
		int input = Integer.parseInt(in.nextLine());
		while(input > 0) {
			lines.add(input);
			input = Integer.parseInt(in.nextLine());
		}
	}
}