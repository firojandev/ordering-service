package com.experiment.order.modules.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    public UserModel findByUsername(String username);
    UserModel findFirstById(Long id);

}