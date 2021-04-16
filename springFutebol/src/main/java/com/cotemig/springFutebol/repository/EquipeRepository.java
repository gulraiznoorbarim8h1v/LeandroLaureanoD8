package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Equipe;

@Repository("equipeRepository")
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
	
}
