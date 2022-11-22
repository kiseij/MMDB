package movies.moviesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MoviesDemoApplication {
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public String sayHello() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MoviesDemoApplication.class, args);
	}

}
