package pl.damrob.votas.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VotasApplicationService {

    private final UserRepository userRepository;

    public void addUser(String name, String password) {
        if (userRepository.existByName(name)) {
            throw new UserAlreadyExistsException(name);
        }

        userRepository.insert(new User(name, password));
    }

    public User getUser(String name) {
        return userRepository.getByName(name);
    }

    public static class UserAlreadyExistsException extends RuntimeException {
        UserAlreadyExistsException(String name) {
            super(String.format("User with name=%s already exists in database", name));
        }
    }
}
