package com.muntu.muntuhabitat.Repositories;

import com.muntu.muntuhabitat.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository{// extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String roleStudent);
}