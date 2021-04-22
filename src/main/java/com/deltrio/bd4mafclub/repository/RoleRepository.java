package com.deltrio.bd4mafclub.repository;
import com.deltrio.bd4mafclub.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByName(String name);
}
