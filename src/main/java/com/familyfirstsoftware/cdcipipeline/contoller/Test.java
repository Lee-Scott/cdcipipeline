package com.familyfirstsoftware.cdcipipeline.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Test {

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(Map.of("Testing", "Test Data"));
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> HealthCheck() {
        return ResponseEntity.ok().body(Map.of("Status", "Up"));
    }

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> Hello() {
        return ResponseEntity.ok().body(Map.of("Hello", "World"));
    }


}
