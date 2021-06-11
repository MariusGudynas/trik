package trikampis.trik;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class LinesFromFile extends Lines {
	LinesFromFile() {
		super();
	}
	
	LinesFromFile(String filename) {
		super();
		readLinesFromFile (filename);
	}
	
	public void readLinesFromFile(String filename) {
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				lines.add(Integer.parseInt(data));
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
	    }
	}
}