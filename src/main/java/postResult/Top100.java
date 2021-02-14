package postResult;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Top100{
	
	public static void main(String[] args) throws IOException {
	
		
		File dec25 = new File("25Dec.txt");
		File dec25SongId = new File("25DecSongID.txt");
		File dec25Score = new File("25DecScore.txt");
		File dec26 = new File("26Dec.txt");
		File dec26SongId = new File("26DecSongID.txt");
		File dec26Score = new File("26DecScore.txt");
		File dec27 = new File("27Dec.txt");
		File dec27SongId = new File("27DecSongID.txt");
		File dec27Score = new File("27DecScore.txt");
		File dec28 = new File("28Dec.txt");
		File dec28SongId = new File("28DecSongID.txt");
		File dec28Score = new File("28DecScore.txt");
		File dec29 = new File("29Dec.txt");
		File dec29SongId = new File("29DecSongID.txt");
		File dec29Score = new File("29ecScore.txt");
		File dec30 = new File("30Dec.txt");
		File dec30SongId = new File("30DecSongID.txt");
		File dec30Score = new File("30ecScore.txt");
		File dec31 = new File("31Dec.txt");
		File dec31SongId = new File("31DecSongID.txt");
		File dec31Score = new File("31DecScore.txt");
		
		
		
		BufferedReader dec25Reader = new BufferedReader(new FileReader(dec25));
		BufferedReader dec26Reader = new BufferedReader(new FileReader(dec26));
		BufferedReader dec27Reader = new BufferedReader(new FileReader(dec27));
		BufferedReader dec28Reader = new BufferedReader(new FileReader(dec28));
		BufferedReader dec29Reader = new BufferedReader(new FileReader(dec29));
		BufferedReader dec30Reader = new BufferedReader(new FileReader(dec30));
		BufferedReader dec31Reader = new BufferedReader(new FileReader(dec31));
		
		BufferedWriter dec25SongIDWriter  = new BufferedWriter(new FileWriter(dec25SongId));
		BufferedWriter dec25SongScoreWriter  = new BufferedWriter(new FileWriter(dec25Score));
		BufferedWriter dec26SongIDWriter  = new BufferedWriter(new FileWriter(dec26SongId));
		BufferedWriter dec26SongScoreWriter  = new BufferedWriter(new FileWriter(dec26Score));
		BufferedWriter dec27SongIDWriter  = new BufferedWriter(new FileWriter(dec27SongId));
		BufferedWriter dec27SongScoreWriter  = new BufferedWriter(new FileWriter(dec27Score));
		BufferedWriter dec28SongIDWriter  = new BufferedWriter(new FileWriter(dec28SongId));
		BufferedWriter dec28SongScoreWriter  = new BufferedWriter(new FileWriter(dec28Score));
		BufferedWriter dec29SongIDWriter  = new BufferedWriter(new FileWriter(dec29SongId));
		BufferedWriter dec29SongScoreWriter  = new BufferedWriter(new FileWriter(dec29Score));
		BufferedWriter dec30SongIDWriter  = new BufferedWriter(new FileWriter(dec30SongId));
		BufferedWriter dec30SongScoreWriter  = new BufferedWriter(new FileWriter(dec30Score));
		BufferedWriter dec31SongIDWriter  = new BufferedWriter(new FileWriter(dec31SongId));
		BufferedWriter dec31SongScoreWriter  = new BufferedWriter(new FileWriter(dec31Score));
		
		while(dec25Reader.readLine()!=null){
			try{
				String dec25line = dec25Reader.readLine();
				String st[] = dec25line.split(" ");
				String songID = st[0];
				String score = st[1];
				dec25SongIDWriter.flush();
				dec25SongIDWriter.write(songID);
				dec25SongIDWriter.newLine();
				dec25SongScoreWriter.flush();
				dec25SongScoreWriter.write(score);
				dec25SongScoreWriter.newLine();
				
				
				String dec26line = dec25Reader.readLine();
				String st_26[] = dec26line.split(" ");
				String songID_26 = st[0];
				String score_26 = st[1];
				dec26SongIDWriter.flush();
				dec26SongIDWriter.write(songID);
				dec26SongIDWriter.newLine();
				dec26SongScoreWriter.flush();
				dec26SongScoreWriter.write(score);
				dec26SongScoreWriter.newLine();
				
				String dec27line = dec27Reader.readLine();
				String st_27[] = dec27line.split(" ");
				String songID_27 = st[0];
				String score_27 = st[1];
				dec27SongIDWriter.flush();
				dec27SongIDWriter.write(songID);
				dec27SongIDWriter.newLine();
				dec27SongScoreWriter.flush();
				dec27SongScoreWriter.write(score);
				dec27SongScoreWriter.newLine();
				
				

				String dec28line = dec28Reader.readLine();
				String st_28[] = dec28line.split(" ");
				String songID_28 = st[0];
				String score_28 = st[1];
				dec28SongIDWriter.flush();
				dec28SongIDWriter.write(songID_28);
				dec28SongIDWriter.newLine();
				dec28SongScoreWriter.flush();
				dec28SongScoreWriter.write(score_28);
				dec28SongScoreWriter.newLine();
				

				String dec29line = dec29Reader.readLine();
				String st_29[] = dec29line.split(" ");
				String songID_29 = st[0];
				String score_29 = st[1];
				dec29SongIDWriter.flush();
				dec29SongIDWriter.write(songID_29);
				dec29SongIDWriter.newLine();
				dec29SongScoreWriter.flush();
				dec29SongScoreWriter.write(score_29);
				dec29SongScoreWriter.newLine();
				
				String dec30line = dec30Reader.readLine();
				String st_30[] = dec30line.split(" ");
				String songID_30 = st[0];
				String score_30 = st[1];
				dec30SongIDWriter.flush();
				dec30SongIDWriter.write(songID_30);
				dec30SongIDWriter.newLine();
				dec30SongScoreWriter.flush();
				dec30SongScoreWriter.write(score_30);
				dec30SongScoreWriter.newLine();
				
				String dec31line = dec31Reader.readLine();
				String st_31[] = dec31line.split(" ");
				String songID_31 = st[0];
				String score_31 = st[1];
				dec31SongIDWriter.flush();
				dec31SongIDWriter.write(songID_31);
				dec31SongIDWriter.newLine();
				dec31SongScoreWriter.flush();
				dec31SongScoreWriter.write(score_31);
				dec31SongScoreWriter.newLine();
			}
			catch(Exception e){
				
			}
			
		}

	}
}