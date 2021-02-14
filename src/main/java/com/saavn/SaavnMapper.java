package com.saavn;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class SaavnMapper extends
		Mapper<LongWritable, Text, Text, DoubleWritable> {

	public static List<String> days = Arrays.asList("25", "26", "27", "28",
			"29", "30", "31"); // days that are under consideration for the
								// trending list

	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		String st[] = value.toString().split(","); // splitting sondID,hour,date
		String songId = st[0];
		double hour = 0;
		try {
			hour = Double.parseDouble(st[3]);
		} catch (Exception e) {

		}
		String date[] = st[4].toString().split("-");
		String day = "";
		if (date.length > 1) {
			day = date[2];
		}
		double recency = 23 - hour;
		double score = Math.pow(1 - 0.05, recency); // Formula to find the score
													// of each song
		String keyForMap = songId + " " + day;

		if (days.contains(day) && songId.length() == 8) {
			context.write(new Text(keyForMap), new DoubleWritable(score)); // writing
																			// into
																			// the
																			// mapper
																			// as
																			// (<songID,Day>,<score>)
		}

	}
}
