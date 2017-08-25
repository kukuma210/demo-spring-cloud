package com.shineway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
@SpringBootApplication
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCloudConfigClientApplication.class, args);

	}
}
