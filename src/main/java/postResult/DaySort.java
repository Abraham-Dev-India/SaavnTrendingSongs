package postResult;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DaySort {

	public static void main(String[] args) throws IOException {

		File f = new File("result -1.txt"); // PLEASE NOTE: this is the file
											// containing the final results from
											// AWS
		File dec25 = new File("25Dec.txt");
		File dec26 = new File("26Dec.txt");
		File dec27 = new File("27Dec.txt");
		File dec28 = new File("28Dec.txt");
		File dec29 = new File("29Dec.txt");
		File dec30 = new File("30Dec.txt");
		File dec31 = new File("31Dec.txt");

		BufferedWriter dec25Writer = new BufferedWriter(new FileWriter(dec25));
		BufferedWriter dec26Writer = new BufferedWriter(new FileWriter(dec26));
		BufferedWriter dec27Writer = new BufferedWriter(new FileWriter(dec27));
		BufferedWriter dec28Writer = new BufferedWriter(new FileWriter(dec28));
		BufferedWriter dec29Writer = new BufferedWriter(new FileWriter(dec29));
		BufferedWriter dec30Writer = new BufferedWriter(new FileWriter(dec30));
		BufferedWriter dec31Writer = new BufferedWriter(new FileWriter(dec31));

		BufferedReader br = new BufferedReader(new FileReader(f));
		while (br.readLine() != null) {

			try {
				String line = br.readLine(); // extracting entire line
				String[] st = new String[line.length()];
				st = line.split(" "); // splitting the line into two using
										// whitespace as delimiter
				String day = st[1].substring(0, 2); // extracting day
				String score = st[1].substring(3, 7); // extracting score
				String songId = st[0]; // extracting songID
				String songIdAndScore = songId + " " + score; // concatentating
																// songId and
																// score

				// seperating the results of each day and writing them into 7
				// different text files

				if (day.equalsIgnoreCase("25")) {
					dec25Writer.flush();
					dec25Writer.write(songIdAndScore);
					dec25Writer.newLine();
				} else if (day.equalsIgnoreCase("26")) {
					dec26Writer.flush();
					dec26Writer.write(songIdAndScore);
					dec26Writer.newLine();
				} else if (day.equalsIgnoreCase("27")) {
					dec27Writer.flush();
					dec27Writer.write(songIdAndScore);
					dec27Writer.newLine();
				} else if (day.equalsIgnoreCase("28")) {
					dec28Writer.flush();
					dec28Writer.write(songIdAndScore);
					dec28Writer.newLine();
				} else if (day.equalsIgnoreCase("29")) {
					dec29Writer.flush();
					dec29Writer.write(songIdAndScore);
					dec29Writer.newLine();
				} else if (day.equalsIgnoreCase("30")) {
					dec30Writer.flush();
					dec30Writer.write(songIdAndScore);
					dec30Writer.newLine();
				} else if (day.equalsIgnoreCase("31")) {
					dec31Writer.flush();
					dec31Writer.write(songIdAndScore);
					dec31Writer.newLine();
				}
			} catch (Exception e) {

			}
		}

		// closing both input and output streams
		dec25Writer.close();
		dec26Writer.close();
		dec27Writer.close();
		dec28Writer.close();
		dec29Writer.close();
		dec30Writer.close();
		dec31Writer.close();
		br.close();

	}
}
