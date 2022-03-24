package com.example.xxlweb.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class MyJob {
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler() throws Exception {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("XXL-JOB, Hello World：{}", param);
        return ReturnT.SUCCESS;
    }
}
