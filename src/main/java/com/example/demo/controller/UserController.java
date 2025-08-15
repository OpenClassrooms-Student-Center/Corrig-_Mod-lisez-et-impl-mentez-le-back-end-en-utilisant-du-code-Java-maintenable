package com.example.demo.controller;

import com.example.demo.entity.DTOuser;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private AuthService authService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<DTOuser> getUserById(@PathVariable Long id) {
        UserEntity userEntity = userRepository.getReferenceById(id);

        if (userEntity != null) {
            DTOuser dtOuser = new DTOuser();
            dtOuser.setId(userEntity.getId());
            dtOuser.setName(userEntity.getName());
            dtOuser.setEmail(userEntity.getEmail());
            dtOuser.setCreated_at(userEntity.getCreated_at());
            dtOuser.setUpdated_at(userEntity.getUpdated_at());
            return new ResponseEntity<>(dtOuser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
