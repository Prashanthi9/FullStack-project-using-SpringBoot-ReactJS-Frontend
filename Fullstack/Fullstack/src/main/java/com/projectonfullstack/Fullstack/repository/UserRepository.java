package com.projectonfullstack.Fullstack.repository;

import com.projectonfullstack.Fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
