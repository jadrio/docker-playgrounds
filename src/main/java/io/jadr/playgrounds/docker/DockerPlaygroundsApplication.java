package io.jadr.playgrounds.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DockerPlaygroundsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerPlaygroundsApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET)
	String hello() {
        return "hello";
    }
}
