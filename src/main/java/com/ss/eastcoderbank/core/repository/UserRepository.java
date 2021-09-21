package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface UserRepository extends JpaRepository <User, Integer> {


        User findUsersByEmailOrCredentialUsername(String email, String Username);

        Page<User> findUserByRoleTitle(String title, Pageable page);


        User findByCredentialUsername(String username);

        /**
         *
         * @param page
         * @return a Page of active users
         */
        Page<User> findAllByActiveStatusIsTrue(Pageable page);

        /**
         *
         * @param page
         * @return a Page of inactive users
         */
        Page<User> findAllByActiveStatusIsFalse(Pageable page);


    }

    User findByCredentialUsername(String username);

   // @Query(value = "SELECT a FROM User WHERE a CONCAT(a.firstName, ' ', a.lastName, ' ', a.credential.username, ' ', a.email) LIKE %?1%", countQuery = "SELECT count(a) FROM User a WHERE CONCAT(a.firstName, ' ', a.lastName, ' ', a.credential.username, ' ', a.email) LIKE %?1%")
   @Query(value = "select a FROM User a WHERE CONCAT(a.firstName, ' ', a.lastName, ' ', a.credential.username, ' ', a.email) LIKE %?1%", countQuery = "SELECT count(a) FROM User a WHERE CONCAT(a.firstName, ' ', a.lastName, ' ', a.credential.username, ' ', a.email) LIKE %?1%")
   //@Query("SELECT a FROM User a WHERE " +
   //        "LOWER(a.credential.username) LIKE LOWER(CONCAT('%',:keyword, '%')) OR " +
   //        "LOWER(a.firstName) LIKE LOWER(CONCAT('%',:keyword, '%')) OR " +
    //       "LOWER(a.lastName) LIKE LOWER(CONCAT('%',:keyword, '%'))")
        //@Query(value = "SELECT * FROM USER WHERE USERNAME = ?1",
     //       countQuery = "SELECT count(*) FROM USER WHERE USERNAME = ?1",
     //       nativeQuery = true)
    Page<User> search(String keyword, Pageable page);

    /**
     *
     * @param page
     * @return a Page of active users
     */
    Page<User> findAllByActiveStatusIsTrue(Pageable page);

    /**
     *
     * @param page
     * @return a Page of inactive users
     */
    Page<User> findAllByActiveStatusIsFalse(Pageable page);
}
