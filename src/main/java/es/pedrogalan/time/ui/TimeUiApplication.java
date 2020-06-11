package es.pedrogalan.time.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TimeUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeUiApplication.class, args);
	}

}
