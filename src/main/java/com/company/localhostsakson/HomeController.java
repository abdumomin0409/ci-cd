package com.company.localhostsakson;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/sakson")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        log.info("Home page");
        return ResponseEntity.ok("Home page");
    }

    @GetMapping("/er")
    public ResponseEntity<String> error() {
        log.error("Error page");
        return ResponseEntity.ok("Error page");
    }

    @GetMapping("/warn")
    public ResponseEntity<String> info() {
        log.warn("Warn page");
        return ResponseEntity.ok("Warn page");
    }


}
