package com.deltrio.bd4mafclub.repository;

import com.deltrio.bd4mafclub.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u from User u join fetch u.roles where u.email =:email")
    User findByEmail(@Param("email") String email);

    User findUsersByNickName (String nickName);
}
