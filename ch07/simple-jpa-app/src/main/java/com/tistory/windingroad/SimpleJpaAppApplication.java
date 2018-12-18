package com.tistory.windingroad;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tistory.windingroad.service.JournalService;

@SpringBootApplication

public class SimpleJpaAppApplication {

	private static final Logger log = LoggerFactory.getLogger(SimpleJpaAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(JournalService service) {
		return args -> {
			// resources/data.sql → data insert

			//log.info("@@ 데이터 생성....");
			//service.insertData();
			log.info("@@ findAll() 호출...");
			service.findAll().forEach(entry -> log.info(entry.toString()));
			log.info("@@ findByCreatedAfter() 호출...");
			service.findByCreatedAfter(new SimpleDateFormat("MM/dd/yyyy").parse("02/01/2016")).forEach(entry -> log.info(entry.toString()));
			log.info("@@ findByCustomQuery() 호출...");
			service.findByCustomQuery("해부").forEach(entry -> log.info(entry.toString()));
		};
	}

}

