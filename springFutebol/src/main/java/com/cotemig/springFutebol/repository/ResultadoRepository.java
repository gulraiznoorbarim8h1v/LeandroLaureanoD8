package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Resultado;

@Repository("resultadoRepository")
public interface ResultadoRepository extends JpaRepository<Resultado, Integer> {
	
}
