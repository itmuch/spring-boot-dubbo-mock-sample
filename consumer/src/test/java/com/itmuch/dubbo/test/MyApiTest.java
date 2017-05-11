package com.itmuch.dubbo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsumerTest.class)
public class MyApiTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        MyApi myApi = applicationContext.getBean(MyApi.class);
        RemoteApi fromSpring = applicationContext.getBean(RemoteApi.class);
        myApi.setRemoteApi(fromSpring);
    }

    @Autowired
    public MyApi myApi;

    @Test
    public void hold() {
        Assert.assertEquals("我是Mock的API。", this.myApi.hold());
    }
}