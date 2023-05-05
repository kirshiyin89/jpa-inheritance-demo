package com.jpainheritance.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "A")
public class ConcreteEntityA extends MappedBaseEntity {

    String date;
}
