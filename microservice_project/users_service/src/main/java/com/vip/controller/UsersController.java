package com.vip.controller;

import com.vip.model.Users;
import com.vip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public ResponseEntity<Users> findUserById(@PathVariable Long id){

        Users user = userService.getUser(id);
        // url for getting contacts from contacts service "http://localhost:9002/get/contacts/{userId}"
//        List forObject = this.restTemplate.getForObject("http://localhost:9002/get/contacts/"+id, List.class);
        List forObject = this.restTemplate.getForObject("http://contact-service/get/contacts/"+id, List.class);

        user.setContacts(forObject);
        return ResponseEntity.ok(user);
    }


}
