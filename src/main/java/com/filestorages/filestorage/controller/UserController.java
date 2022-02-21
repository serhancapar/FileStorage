package com.filestorages.filestorage.controller;

import com.filestorages.filestorage.repository.entity.UserEntity;
import com.filestorages.filestorage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody UserEntity theUser){
    userService.save(theUser);
        return ResponseEntity.ok("Ok");
    }


}
