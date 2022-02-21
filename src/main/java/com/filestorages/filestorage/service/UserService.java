package com.filestorages.filestorage.service;

import com.filestorages.filestorage.repository.UserRepository;
import com.filestorages.filestorage.repository.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(UserEntity theUser) {
        userRepository.save(theUser);
    }
}
