package com.vip.service;

import com.vip.model.Users;
import com.vip.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Users getUser(Long id) {

        return usersRepo.findById(id).get();

    }
}
