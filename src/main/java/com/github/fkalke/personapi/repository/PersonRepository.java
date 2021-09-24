package com.github.fkalke.personapi.repository;


import com.github.fkalke.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
