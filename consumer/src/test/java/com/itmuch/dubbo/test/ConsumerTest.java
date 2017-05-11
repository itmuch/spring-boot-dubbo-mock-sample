package com.itmuch.dubbo.test;

import org.powermock.api.mockito.PowerMockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerTest {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerTest.class, args);
    }

    @Bean
    public RemoteApi RemoteApi() {
        RemoteApi remoteApi = PowerMockito.mock(RemoteApi.class);
        PowerMockito.when(remoteApi.hold())
                .thenAnswer(t -> "我是Mock的API。");
        return remoteApi;
    }
}