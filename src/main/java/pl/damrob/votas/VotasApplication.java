package pl.damrob.votas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class VotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotasApplication.class, args);
	}

}
