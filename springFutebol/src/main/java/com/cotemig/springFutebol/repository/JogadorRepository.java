package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Jogador;

@Repository("jogadorRepository")
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
	
}
