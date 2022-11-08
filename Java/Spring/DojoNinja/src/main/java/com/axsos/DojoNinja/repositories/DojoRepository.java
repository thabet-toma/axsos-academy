package com.axsos.DojoNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.DojoNinja.models.Dojo;
@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
public List <Dojo> findAll();
}
