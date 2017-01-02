package com.example;

import org.apache.catalina.servlet4preview.RequestDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFacebookApplication.class, args);
	}
}

@RestController
class HomeController {

	@GetMapping("/")
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/test/");
	}
}

