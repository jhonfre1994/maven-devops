/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.controller;

import com.devops.ejemplo.model.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devops.ejemplo.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author jhonfre
 */
@RestController
@RequestMapping("/api/v.1/person")
public class PersonController {

    @Autowired
    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<?> getPersons() {
        List<PersonDTO> res = service.listPersons();
        return ResponseEntity.ok(res);
    }

    @PostMapping("")
    public ResponseEntity<?> savePerson(@RequestBody PersonDTO person) {
        PersonDTO res = service.savePerson(person);
        return ResponseEntity.ok(res);
    }
}
