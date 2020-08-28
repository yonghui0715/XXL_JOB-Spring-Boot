package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class HelloXxJob {
    private static Logger logger = LoggerFactory.getLogger(HelloXxJob.class);

    public void before(){
        System.out.println("我在demoJobHandler方法初始化时执行");
    }
    @XxlJob(value ="test01" , init = "before",destroy="destory01")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        XxlJobLogger.log("test01。。。。。");

        System.out.println("定时任务》》》"+param);

        return ReturnT.SUCCESS;
    }
    public void destory01(){
        System.out.println("我在demoJobHandler方法关闭执行");
    }
}
