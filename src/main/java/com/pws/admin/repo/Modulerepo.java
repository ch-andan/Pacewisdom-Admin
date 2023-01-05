package com.pws.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.Module;

@Repository
public interface Modulerepo extends JpaRepository<Module, Integer> {

}
