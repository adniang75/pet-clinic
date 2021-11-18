package com.alassaneniang.petclinic.service;

import com.alassaneniang.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById ( Long id );

    Pet save ( Pet pet );

    Set<Pet> findAll ();

}
