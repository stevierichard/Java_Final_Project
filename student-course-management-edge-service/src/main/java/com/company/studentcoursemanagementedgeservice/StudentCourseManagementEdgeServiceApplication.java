package com.company.studentcoursemanagementedgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentCourseManagementEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseManagementEdgeServiceApplication.class, args);
	}

}
