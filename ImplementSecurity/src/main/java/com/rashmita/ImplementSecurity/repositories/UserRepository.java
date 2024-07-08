package com.rashmita.ImplementSecurity.repositories;
import com.rashmita.ImplementSecurity.entities.User;
//import com.tericcabrel.authapi.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}