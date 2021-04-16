package com.cotemig.springFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.springFutebol.model.Estado;

@Repository("estadoRepository")
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
}
