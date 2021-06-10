package com.sundar.demo;

import com.sundar.demo.common.Helper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
		log.info("Demo Api service started ..... At={}", Helper.getLocalUtcDateTime());
	}

}
