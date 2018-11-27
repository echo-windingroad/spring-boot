package com.windingroad.tistory.spring;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		//버전 3.
		SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
		app.setBanner(new Banner() {
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				out.print("\n\n\tThis is my own banner!\n\n".toUpperCase());
			}
		});
		app.run(args);

	}
}
