package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User, Integer> {


    User findUsersByEmailOrCredentialUsername(String email, String Username);

    Page<User> findUserByRoleTitle(String title, Pageable page);


    User findByCredentialUsername(String username);

}
