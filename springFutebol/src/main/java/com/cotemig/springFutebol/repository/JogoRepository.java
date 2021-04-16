package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Jogo;

@Repository("jogoRepository")
public interface JogoRepository extends JpaRepository<Jogo, Integer> {
	
}
