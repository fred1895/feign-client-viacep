package io.fred1985.github.feigntests.feigntests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignTestsApplication.class, args);
	}

}
