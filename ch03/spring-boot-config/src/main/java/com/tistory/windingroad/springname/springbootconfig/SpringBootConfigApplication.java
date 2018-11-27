package com.tistory.windingroad.springname.springbootconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigApplication.class, args);
	}

	private static Logger log = LoggerFactory.getLogger(SpringBootConfigApplication.class);

	// mvn spring-boot:run -Dserver.ip=192.168.12.1
	@Value("${server.ip}")
	String serverIp;

//	@Autowired
//	MyAppProperties props;

	@Bean
	CommandLineRunner values() {
		return args -> {
			log.info(" > 서버 IP: " + serverIp);
//			log.info(" > 애플리케이션 명: " + props.getName());
//			log.info(" > 애플리케이션 정보: " + props.getDescription());
		};
	}

}
