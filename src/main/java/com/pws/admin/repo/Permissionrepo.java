package com.pws.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.Permission;

@Repository
public interface Permissionrepo extends JpaRepository<Permission, Integer> {

}
