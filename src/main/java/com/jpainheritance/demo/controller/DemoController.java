package com.jpainheritance.demo.controller;

import com.jpainheritance.demo.entity.ConcreteEntityA;
import com.jpainheritance.demo.entity.ConcreteEntityB;
import com.jpainheritance.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(path = "/a")
    public List<ConcreteEntityA> getAAttributes() {
        return demoService.getA();
    }

    @GetMapping(path = "/b")
    public List<ConcreteEntityB> getBAttributes() {
        return demoService.getB();
    }

    @GetMapping(path = "/b/number")
    public ConcreteEntityB getBNumber(@RequestParam int number) {
        return demoService.getBFromNumber(number);
    }
}
