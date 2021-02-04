package com.astro.smitebasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.astro.smitebasic.api"})
@EnableJpaRepositories(basePackages="com.astro.smitebasic.repositories")
@EnableTransactionManagement
@EntityScan(basePackages={"com.astro.smitebasic.objects.characters.auxiliary", "com.astro.smitebasic.objects.characters",
		"com.astro.smitebasic.objects.gamedata.matches", "com.astro.smitebasic.objects.gamedata",
		"com.astro.smitebasic.objects.items", "com.astro.smitebasic.objects.player.auxiliary", "com.astro.smitebasic.objects.player",
		"com.astro.smitebasic.objects.player.matches", "com.astro.smitebasic.objects.session"})
public class SmitebasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SmitebasicApplication.class, args);
	}
}
