package com.jrp.demo.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("hello")
@RestController
public class HelloController {
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping
    public ResponseEntity<JsonNode> test() throws Exception {
        JsonNode node = objectMapper.readTree("{\"message\": \"Hello, world!\"}");
        return new ResponseEntity<>(node, HttpStatus.OK);
    }

}
