package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Cidade;

@Repository("cidadeRepository")
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
}
