package edu.isu.capstone.bookrec.backend.repositories;

import edu.isu.capstone.bookrec.backend.hibernate.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
}
