package com.example.apipersonas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apipersonas.entity.persona;

@Repository
public interface personaRepository extends JpaRepository<persona, Long> {

}
