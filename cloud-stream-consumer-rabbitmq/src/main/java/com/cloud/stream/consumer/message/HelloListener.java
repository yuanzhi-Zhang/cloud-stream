package com.cloud.stream.consumer.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @Author: 张远志
 * @Date: 2020/6/21 20:55
 */

@EnableBinding(HelloBinding.class)
public class HelloListener {
	@StreamListener(target = HelloBinding.GREETING)
	public void processHelloChannelGreeting(String msg) {
		System.out.println(msg);
	}
}
