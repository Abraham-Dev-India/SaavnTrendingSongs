package com.saavn;

import java.io.*;

import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapred.lib.MultipleOutputs;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*;
import org.apache.hadoop.conf.*;

public class SaavnDriver extends Configured implements Tool {

	public static void main(String[] args) throws Exception {
		int returnStatus = ToolRunner.run(new Configuration(),
				new SaavnDriver(), args);
		System.exit(returnStatus);
	}

	public int run(String[] args) throws IOException {

		Job job = new Job(getConf());
		job.setJobName("Saavn Music App");
		job.setJarByClass(SaavnDriver.class); // entry class
		job.setOutputKeyClass(Text.class); // outputkeyDataType - Text
		job.setOutputValueClass(DoubleWritable.class); // outputvalueDataType -
														// DoubleWritable
		job.setMapperClass(SaavnMapper.class); // setting mapper class
		job.setCombinerClass(SaavnReducer.class); // setting combiner class
		job.setReducerClass(SaavnReducer.class); // setting reducer class
		FileInputFormat.addInputPath(job, new Path(args[0])); // first argument
																// set as input
																// path
		FileOutputFormat.setOutputPath(job, new Path(args[1])); // second
																// argument set
																// as output
																// path

		try {
			return job.waitForCompletion(true) ? 0 : 1;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 0;

	}

}