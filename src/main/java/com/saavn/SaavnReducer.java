package com.saavn;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SaavnReducer extends
		Reducer<Text, DoubleWritable, Text, DoubleWritable> {

	@Override
	public void reduce(Text key, Iterable<DoubleWritable> values,
			Context context) throws IOException, InterruptedException {
		double score = 0; // initializing score
		for (@SuppressWarnings("unused")
		DoubleWritable value : values) {
			score = score + value.get(); // adding score
		}
		DoubleWritable result = new DoubleWritable();
		result.set(score); // using combiner to aggregate score
		context.write(key, result); // writing to the reducer as
									// (<songID,Day>,<score>)
	}
}
