package com.s3.test;

import com.s3.test.repository.CustomerRepositoryInterface;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.NumberFormat;
import java.util.stream.Stream;

@SpringBootApplication()
public class TestApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

	}

}
