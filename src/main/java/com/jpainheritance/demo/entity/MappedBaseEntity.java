package com.jpainheritance.demo.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MappedBaseEntity {

    @Id
    private String id;

    private String status;

    private String type;
}
