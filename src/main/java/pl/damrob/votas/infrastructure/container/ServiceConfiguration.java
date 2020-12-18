package pl.damrob.votas.infrastructure.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.damrob.votas.domain.UserRepository;
import pl.damrob.votas.domain.VotasApplicationService;

@Configuration
public class ServiceConfiguration {

    @Bean
    VotasApplicationService votasApplicationService(UserRepository userRepository) {
        return new VotasApplicationService(userRepository);
    }
}
