package io.fred1985.github.feigntests.feigntests;

import io.fred1985.github.feigntests.feigntests.feign.rest.ViaCepRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignTestsApplication implements CommandLineRunner {

	@Autowired
	private ViaCepRest rest;

	public static void main(String[] args) {
		SpringApplication.run(FeignTestsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rest.getPlaceFromViaCep();
	}
}
