/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.service;

import com.devops.ejemplo.model.PersonDTO;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public interface PersonService {
    
    PersonDTO savePerson(PersonDTO dto);
    
    List<PersonDTO> listPersons();
    
}
