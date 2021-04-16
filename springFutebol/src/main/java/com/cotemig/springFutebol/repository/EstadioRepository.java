package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Estadio;

@Repository("estadioRepository")
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {
	
}
