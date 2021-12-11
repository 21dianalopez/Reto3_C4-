/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto_3_C4.repositoriesCrud;

import com.example.Reto_3_C4.entities.Clothe;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Diana L
 */
public interface ClotheCrudRepository extends MongoRepository<Clothe,Integer>{
    
    Optional<Clothe> findByReference(String reference);
    
}
