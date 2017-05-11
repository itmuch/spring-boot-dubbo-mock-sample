package com.itmuch.dubbo.test;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author 周立[OF2595]
 *         company qianmi.com
 *         Date 2017-05-11
 */
@Service
public class RemoteApiImpl implements RemoteApi {
    @Override
    public String hold() {
        return "我是真正的远程API。";
    }
}
