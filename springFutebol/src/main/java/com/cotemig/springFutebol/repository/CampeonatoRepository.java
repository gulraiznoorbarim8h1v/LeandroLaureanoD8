package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Campeonato;

@Repository("campeonatoRepository")
public interface CampeonatoRepository extends JpaRepository<Campeonato, Integer> {
	
}
