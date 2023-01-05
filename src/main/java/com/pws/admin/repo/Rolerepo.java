package com.pws.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.Role;


@Repository
public interface Rolerepo extends JpaRepository<Role, Integer> {

}