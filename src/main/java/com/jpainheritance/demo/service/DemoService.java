package com.jpainheritance.demo.service;

import com.jpainheritance.demo.entity.ConcreteEntityA;
import com.jpainheritance.demo.entity.ConcreteEntityB;
import com.jpainheritance.demo.repository.ConcreteARepository;
import com.jpainheritance.demo.repository.ConcreteBRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private final ConcreteARepository concreteARepository;
    private final ConcreteBRepository concreteBRepository;

    public DemoService(ConcreteARepository concreteARepository, ConcreteBRepository concreteBRepository) {
        this.concreteARepository = concreteARepository;
        this.concreteBRepository = concreteBRepository;
    }

    public List<ConcreteEntityA> getA() {
        return concreteARepository.findByType("type");
    }

    public List<ConcreteEntityB> getB() {
        return concreteBRepository.findByType("type");
    }

    public ConcreteEntityB getBFromNumber(int number) {
        return concreteBRepository.findByNumber(number);
    }
}
