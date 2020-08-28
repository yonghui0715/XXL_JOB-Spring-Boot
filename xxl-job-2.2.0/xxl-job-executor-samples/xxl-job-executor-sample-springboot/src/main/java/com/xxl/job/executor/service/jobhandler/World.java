package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.core.handler.IJobHandler;
import org.springframework.stereotype.Component;

@Component
public class World extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobExecutor.registJobHandler("demoJobHandler", new World());
        return null;
    }
}
