package com.cloud.stream.consumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: 张远志
 * @Date: 2020/6/21 20:21
 */
public interface HelloBinding {

	String GREETING = "greetingChannel";

	/**
	 * 消费消息
	 */
	@Input(HelloBinding.GREETING)
	SubscribableChannel greeting();

}
