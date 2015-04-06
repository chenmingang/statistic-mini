package cn.edu.sdut.common;

/**
 * Created by momo on 15-3-31.
 */
public class LogParam {
    private String url;//当前url
    private String refer;//页面来源
    private String title;//标题
    private String charset;//编码
    private String readyState;//
    private String cookie;
    private String userAgent;
    private String language;
    private String screenWidth;//分辨率宽
    private String screenHeight;//分辨率高

    @Override
    public String toString() {
        return "LogParam{" +
                "url=" + url +
                ",refer=" + refer+
                ",title=" + title +
                ",charset=" + charset +
                ",readyState=" + readyState +
                ",cookie=" + cookie +
                ",userAgent=" + userAgent +
                ",language=" + language +
                ",screenWidth=" + screenWidth +
                ",screenHeight=" + screenHeight +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getReadyState() {
        return readyState;
    }

    public void setReadyState(String readyState) {
        this.readyState = readyState;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }
}
