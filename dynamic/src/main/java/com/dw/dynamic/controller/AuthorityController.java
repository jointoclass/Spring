package com.dw.dynamic.controller;

import com.dw.dynamic.model.Authority;
import com.dw.dynamic.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authority")
public class AuthorityController {
    @Autowired
    AuthorityService authorityService;

    @GetMapping("/all")
    public ResponseEntity<List<Authority>> getAllAuthoritys() {
        return new ResponseEntity<>(
                authorityService.getAllAuthoritys(),
                HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Authority> getAuthorityById(@PathVariable Long id) {
        return new ResponseEntity<>(
                authorityService.getAuthorityById(id),
                HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Authority> getAuthorityByName(@PathVariable String name) {
        return new ResponseEntity<>(
                authorityService.getAuthorityByName(name),
                HttpStatus.OK);
    }
}
