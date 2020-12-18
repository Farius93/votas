package pl.damrob.votas.domain;

public interface UserRepository {
    void insert(User user);

    User getByName(String name);

    boolean existByName(String name);
}
