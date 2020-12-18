package pl.damrob.votas.infrastructure.persistance;

import org.springframework.stereotype.Component;
import pl.damrob.votas.domain.User;

@Component
public class UserFactory {

    User from(UserTuple tuple) {
        return User.builder()
                .name(tuple.getName())
                .password(tuple.getPassword())
                .build();
    }
}
