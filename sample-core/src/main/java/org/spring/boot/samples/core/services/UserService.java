package org.spring.boot.samples.core.services;

import lombok.RequiredArgsConstructor;
import org.spring.boot.samples.core.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

}
