/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.service.impl;

import com.devops.ejemplo.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author jhonfre
 */
public class PersonImplTest {

    private PersonRepository personRepository;
    private ModelMapper mapper;
    PersonImpl personImpl;

    public PersonImplTest() {
    }

    @BeforeEach
    public void setUp() {
        mapper = new ModelMapper();
        personRepository = Mockito.mock(PersonRepository.class);
        personImpl = new PersonImpl(personRepository, mapper);
    }

}
