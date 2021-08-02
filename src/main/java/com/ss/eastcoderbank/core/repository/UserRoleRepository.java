package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRoleRepository extends JpaRepository <UserRole, Integer> {
    Optional<UserRole> findUserRoleByTitle(String title);

}
