package cn.edu.sdut.mapreduce;

import java.io.IOException;
import org.apache.hadoop.fs.Path;
 import org.apache.hadoop.conf.*;
 import org.apache.hadoop.io.*;
 import org.apache.hadoop.mapreduce.*;
 import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
 import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

/**
 * Created by momo on 15-4-1.
 */
public class Log {
    public static class TokenizerMapper extends Mapper<Object, Text, Text, Text>{
    private Text date = new Text();
    private Text params = new Text();
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line=value.toString();
        String check=line.substring(25,33);
        if(check.equalsIgnoreCase("LogParam")){
            String dateStr=line.substring(0,19);
            String paramsStr=line.substring(34);
            date.set(dateStr);
            params.set(paramsStr);
            context.write(date,params);
        }
    }
  }
  public static class IntSumReducer extends Reducer<Text,Text,Text,Text> {
    private IntWritable result = new IntWritable();
    public void reduce(Text key, Text value,Context context) throws IOException, InterruptedException {
      context.write(key, value);
    }
  }
  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
    if (otherArgs.length != 2) {
      System.err.println("Usage: wordcount <in> <out>");
      System.exit(2);
    }
    Job job = new Job(conf, "word count");
    job.setJarByClass(Log.class);
    job.setMapperClass(TokenizerMapper.class);
    job.setCombinerClass(IntSumReducer.class);
    job.setReducerClass(IntSumReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(Text.class);
    FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}
