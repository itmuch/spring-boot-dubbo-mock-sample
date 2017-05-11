package com.itmuch.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class MyApi {
    @Reference
    private RemoteApi remoteApi;

    public RemoteApi getRemoteApi() {
        return remoteApi;
    }

    public void setRemoteApi(RemoteApi remoteApi) {
        this.remoteApi = remoteApi;
    }

    public String hold() {
        return remoteApi.hold();
    }
}