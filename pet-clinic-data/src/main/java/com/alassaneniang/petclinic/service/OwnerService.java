package com.alassaneniang.petclinic.service;

import com.alassaneniang.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName ( String lastName );

}
