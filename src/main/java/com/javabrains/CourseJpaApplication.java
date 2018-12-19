package com.javabrains;

import com.javabrains.repository.TopicRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = TopicRepository.class)
public class CourseJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseJpaApplication.class, args);
	}

}

