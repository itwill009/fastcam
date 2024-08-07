package com.fastcampus.programming.dmaker.controller;



import com.fastcampus.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {
    private final DMakerService dMakerService;


    @GetMapping("/developer")
    public List<String> getAllDevelopers() {
        log.info("GET /developers HTTP/1.1");

        return Arrays.asList("snow","Elsa","Olaf");
    }

    @GetMapping("/create-developer")
    public List<String> createDevelopers() {
        log.info("GET /create-developers HTTP/1.1");

        dMakerService.createDeveloper();

        return Collections.singletonList("Olaf");
    }

}
