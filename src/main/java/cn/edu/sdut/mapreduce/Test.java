package cn.edu.sdut.mapreduce;

/**
 * Created by momo on 15-4-6.
 */
public class Test {
    public static void main(String[] args){
//        String log="2015-04-06 21:16:26_INFO_LogParam{url=http://localhost:8080/statistic,refer=,title=,charset=GBK,readyState=loading,cookie=autologin=1; cookie_login=\"bGlseTo3NDJkMDZjZWIwZjhhNTkwNjJkYTYyNzYxM2Y0YzZkZg==\",userAgent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/34.0.1847.116 Chrome/34.0.1847.116 Safari/537.36,language=en-US,screenWidth=1366,screenHeight=768}";
//        System.out.println(log.substring(25,33));
//        System.out.println(log.substring(34));
        String log="2015-04-06 21:16:17\turl=http://localhost:8080/statistic,refer=,title=,charset=GBK,readyState=loading,cookie=autologin=1; cookie_login=\"bGlseTo3NDJkMDZjZWIwZjhhNTkwNjJkYTYyNzYxM2Y0YzZkZg==\",userAgent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/34.0.1847.116 Chrome/34.0.1847.116 Safari/537.36,language=en-US,screenWidth=1366,screenHeight=768}";
        String[] logStr=log.split("\\t");
        String l=logStr[1];


    }
}
