package com.pws.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {

}
