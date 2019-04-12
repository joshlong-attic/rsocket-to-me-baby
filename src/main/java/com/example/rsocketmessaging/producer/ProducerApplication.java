package com.example.rsocketmessaging.producer;

import com.example.rsocketmessaging.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String args[]) {
		System.setProperty("spring.profiles.active", "producer");
		SpringApplication.run(ProducerApplication.class, args);
	}
}

@Controller
class GreetingsRSocketController {

	@MessageMapping("greet")
	Greeting greet(String name) {
		return new Greeting("Hello " + name + "!");
	}
}

