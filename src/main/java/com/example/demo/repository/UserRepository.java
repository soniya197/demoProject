package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {

	UserData findByEmail(String emailId);

	UserData findByFirstNameAndSecondName(String firstName, String secondName);
}
