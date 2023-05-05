package com.jpainheritance.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CommonRepository<T1, T2> extends JpaRepository<T1, T2> {

    List<T1> findByType(String type);

}