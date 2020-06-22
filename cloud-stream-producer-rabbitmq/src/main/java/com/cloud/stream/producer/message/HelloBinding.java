package com.cloud.stream.producer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: 张远志
 * @Date: 2020/6/21 20:21
 */
public interface HelloBinding {

    String OUTPUT = "greetingChannel";

    /**
     * 发布消息
     */
    @Output(HelloBinding.OUTPUT)
    MessageChannel greeting();
}
