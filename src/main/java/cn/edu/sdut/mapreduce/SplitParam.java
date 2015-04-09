package cn.edu.sdut.mapreduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

import java.io.IOException;

/**
 * Created by momo on 15-4-1.
 */
public class SplitParam {
    public static class SplitMapper extends Mapper<Object, Text, Text, Text>{
    private Text date = new Text();
    private Text params = new Text();
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String log=value.toString();
        String[] logArr=log.split("\\t");

    }
  }
  public static class SplitReducer extends Reducer<Text,Text,Text,Text> {
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
    job.setJarByClass(SplitParam.class);
    job.setMapperClass(SplitMapper.class);
    job.setCombinerClass(SplitReducer.class);
    job.setReducerClass(SplitReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(Text.class);
    FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}
