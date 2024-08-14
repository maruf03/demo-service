package com.dohatec.demo_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/demo")
@CrossOrigin("*")
@RequiredArgsConstructor
public class DemoController {
    @Operation(summary = "API ID: DemoAPI001")
    @GetMapping("/test")
    public ResponseEntity<String> getTestData() {
        return new ResponseEntity<>("All OK", HttpStatus.OK);
    }

}
