package pl.damrob.votas.infrastructure.persistance;

import org.springframework.stereotype.Component;
import pl.damrob.votas.domain.User;

@Component
public class UserTupleFactory {

    UserTuple from(User user) {
        return UserTuple.builder()
                .name(user.getName())
                .password(user.getPassword())
                .build();
    }
}
