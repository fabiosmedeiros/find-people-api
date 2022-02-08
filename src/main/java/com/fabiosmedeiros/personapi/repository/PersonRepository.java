package com.fabiosmedeiros.personapi.repository;

import com.fabiosmedeiros.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
