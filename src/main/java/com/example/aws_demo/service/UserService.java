package com.example.aws_demo.service;

import com.example.aws_demo.entity.User;
import com.example.aws_demo.pojos.request.UserRequest;
import com.example.aws_demo.pojos.response.UserResponse;
import com.example.aws_demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse createUser(UserRequest userRequest) {
        User user = User.builder().name(userRequest.getName()).build();
        user = userRepository.save(user);
        return UserResponse.builder().name(user.getName()).build();
    }
}
