package com.cloud.stream.producer.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.stream.producer.message.HelloBinding;

/**
 * @Author: 张远志
 * @Date: 2020/6/21 20:26
 */

@RestController
public class ProducerController {
	private MessageChannel greet;

	public ProducerController(HelloBinding binding) {
		greet = binding.greeting();
	}

	@GetMapping("/greet/{name}")
	public void publish(@PathVariable("name") String name) {
		String greeting = "Hello," + name + "!";
		Message<String> msg = MessageBuilder.withPayload(greeting).build();
		this.greet.send(msg);
	}
}
