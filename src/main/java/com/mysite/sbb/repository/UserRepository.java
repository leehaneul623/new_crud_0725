package com.mysite.sbb.repository;

import com.mysite.sbb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
