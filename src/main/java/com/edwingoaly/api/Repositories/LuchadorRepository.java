package com.edwingoaly.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edwingoaly.api.Entities.Luchador;

@Repository
public interface LuchadorRepository extends JpaRepository<Luchador, Long> {
    
}
