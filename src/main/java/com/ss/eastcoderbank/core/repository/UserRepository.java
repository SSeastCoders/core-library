package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository <User, Integer> {


    User findUsersByEmailOrCredentialUsername(String email, String Username);

    List<User> findUserByRoleTitle(String title);



    User findByCredentialUsername(String username);

}
