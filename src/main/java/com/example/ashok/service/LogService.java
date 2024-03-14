package com.example.ashok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashok.domain.login;
import com.example.ashok.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;
    public login log(String username,String password)
    {
        login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
