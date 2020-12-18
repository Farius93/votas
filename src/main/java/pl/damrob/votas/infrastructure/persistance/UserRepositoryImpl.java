package pl.damrob.votas.infrastructure.persistance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.damrob.votas.domain.User;
import pl.damrob.votas.domain.UserRepository;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserTupleFactory userTupleFactory;
    private final UserFactory userFactory;

    @Override
    public void insert(User user) {
        userJpaRepository.save(userTupleFactory.from(user));
    }

    @Override
    public User getByName(String name) {
        return userJpaRepository.findByName(name)
                .map(userFactory::from)
                .orElseThrow(() -> new NotFoundException(name));
    }

    @Override
    public boolean existByName(String name) {
        return userJpaRepository.existsByName(name);
    }

    public static class NotFoundException extends RuntimeException {
        NotFoundException(String name) {
            super(String.format("User with name=%s not found", name));
        }
    }
}
