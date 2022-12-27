package com.example.librarysystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface LibCardRepository extends JpaRepository<LibCard,Integer>{

}
