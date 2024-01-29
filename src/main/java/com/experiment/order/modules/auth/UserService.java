package com.experiment.order.modules.auth;


import com.experiment.order.modules.auth.dto.UserRequest;
import com.experiment.order.modules.auth.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();


}