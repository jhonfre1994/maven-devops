/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devops.ejemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jhonfre
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    
    private Integer idPerson;
    private String name;
}
