package com.procesos.concesionario.repository;

import com.procesos.concesionario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}