package com.github.javarushcommunity.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"package com.github.javarushcommunity.jrtb",
		"org.telegram.telegrambots"
})
public class JavaRushTelegramBotApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaRushTelegramBotApplication.class, args);
	}
}
