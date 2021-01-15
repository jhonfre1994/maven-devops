/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.service.impl;

import com.devops.ejemplo.entity.PersonEntity;
import com.devops.ejemplo.model.PersonDTO;
import com.devops.ejemplo.repository.PersonRepository;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devops.ejemplo.service.PersonService;
import lombok.AllArgsConstructor;

/**
 *
 * @author jhonfre
 */
@Service
@AllArgsConstructor
public class PersonImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public PersonDTO savePerson(PersonDTO dto) {
        PersonEntity res = new PersonEntity();
        res = personRepository.save(mapper.map(dto, PersonEntity.class));
        return mapper.map(res, PersonDTO.class);

    }

    @Override
    public List<PersonDTO> listPersons() {
        List<PersonEntity> list = new ArrayList<>();
        list = personRepository.findAll();
        List<PersonDTO> res = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (PersonEntity personEntity : list) {
                res.add(mapper.map(personEntity, PersonDTO.class));
            }
        }
        return res;
    }

}
