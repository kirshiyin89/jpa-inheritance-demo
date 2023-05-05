package com.jpainheritance.demo.controller;

import com.jpainheritance.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(path = "/a")
    public String getAAttributes() {
        return demoService.getA().toString();
    }

    @GetMapping(path = "/b")
    public String getBAttributes() {
        return demoService.getB().toString();
    }
}
