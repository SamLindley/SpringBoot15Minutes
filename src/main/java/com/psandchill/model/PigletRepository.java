package com.psandchill.model;

import org.springframework.data.repository.CrudRepository;

public interface PigletRepository extends CrudRepository<Piglet, Long> {

    Iterable<Piglet> findByName(String name);

}
