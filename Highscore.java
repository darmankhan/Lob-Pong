import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Highscore {
	static String filename = "highscore.txt";
	static File myfile;
	//static String line;

	public static int read()  { //method to read the highest score from the highscore file
		myfile = new File (filename);
		int highx;
		int highfinal =0;
		try {
			Scanner fileread = new Scanner (myfile);
			while (fileread.hasNext()) {
				String line = fileread.nextLine();
				System.out.println("Highscore: " + line); //for testing
				highx = Integer.parseInt(line);
				if (highx>highfinal) {
					highfinal=highx;
				}
			}
			fileread.close();
		} catch (FileNotFoundException e) {
			System.out.println("error");
		}
		return highfinal;
	}

	public static void write(int s) { //method to append argument score into the highscore file
		myfile = new File (filename);
		try {	
			System.out.println("write method was called!");
			FileWriter f2 = new FileWriter(myfile, true);
			PrintWriter out = new PrintWriter(f2);
			out.println(s);
			out.close();	
		} catch (IOException e) {
			System.out.println("File not found!");
		}
	}
}


