package com.experiment.order.modules.auth;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends RefreshableCRUDRepository<UserModel, Long> {

    public UserModel findByUsername(String username);
    UserModel findFirstById(Long id);

}