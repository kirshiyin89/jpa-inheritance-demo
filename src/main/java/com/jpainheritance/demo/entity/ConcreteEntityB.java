package com.jpainheritance.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "B")
public class ConcreteEntityB extends MappedBaseEntity {

    int number;
}
