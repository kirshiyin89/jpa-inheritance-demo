package com.jpainheritance.demo.repository;


import com.jpainheritance.demo.entity.ConcreteEntityB;

public interface ConcreteBRepository extends CommonRepository<ConcreteEntityB, String> {

    ConcreteEntityB findByNumber(int number);
}
