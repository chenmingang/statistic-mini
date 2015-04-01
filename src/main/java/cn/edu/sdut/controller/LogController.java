package cn.edu.sdut.controller;

import cn.edu.sdut.common.LogParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;
/**
 * Created by momo on 15-3-31.
 */
@Controller
@RequestMapping("statistic")
public class LogController {
    private Logger logger = Logger.getLogger(LogController.class);
    @RequestMapping("")
    public String index(){
        return "test";
    }
    @RequestMapping("passport.js")
    @ResponseBody
    public String log(LogParam logParam){
        logger.info(logParam);
        return "0";
    }
}
