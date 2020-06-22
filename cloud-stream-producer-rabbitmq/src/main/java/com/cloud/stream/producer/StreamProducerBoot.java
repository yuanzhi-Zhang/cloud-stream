package com.cloud.stream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.cloud.stream.producer.message.HelloBinding;

/**
 * @Author: 张远志
 * @Date: 2020/6/21 20:03
 */
@EnableBinding(HelloBinding.class)
@SpringBootApplication
public class StreamProducerBoot {
	public static void main(String[] args) {
		SpringApplication.run(StreamProducerBoot.class, args);
	}
}
