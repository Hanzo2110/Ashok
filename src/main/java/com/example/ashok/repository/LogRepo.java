package com.example.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ashok.domain.login;


@Repository
public interface LogRepo extends JpaRepository<login,String> {
    login findByUsernameAndPassword(String username, String password);
}
