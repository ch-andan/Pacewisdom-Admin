package com.pws.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.UserRoleXref;

@Repository
public interface UserRoleXrefrepo extends JpaRepository<UserRoleXref, Integer> {

}