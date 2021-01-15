/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.repository;

import com.devops.ejemplo.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author jhonfre
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{
    
}
