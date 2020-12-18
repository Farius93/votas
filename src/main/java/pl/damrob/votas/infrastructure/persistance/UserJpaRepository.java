package pl.damrob.votas.infrastructure.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<UserTuple, Long> {

    @Override
    <S extends UserTuple> S save(S tuple);

    Optional<UserTuple> findByName(String name);

    boolean existsByName(String name);
}
