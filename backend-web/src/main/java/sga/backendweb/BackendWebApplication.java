package sga.backendweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BackendWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendWebApplication.class, args);
	}

}
