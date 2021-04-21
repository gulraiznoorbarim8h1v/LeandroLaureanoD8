/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.model.Equipe;
import com.cotemig.campeonatoFutebol.service.JogadorService;
import com.cotemig.campeonatoFutebol.service.EquipeService;

/**
 * @author equipe devs
 *
 */
@RestController
public class EquipeRestController {

	@Autowired
	private JogadorService jogadorService;

	@Autowired
	private EquipeService equipeService;

	@RequestMapping(value = "equipe/rest/getAllJogadores/{idEquipe}", method = RequestMethod.GET)
	public List<Jogador> getAllJogadoresByEquipe(@PathVariable("idEquipe") Integer idEquipe) {
		return jogadorService.getAllJogadoresByEquipe(idEquipe);
	}

	@RequestMapping(value = "equipe/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Equipe> getEquipe(@PathVariable("id") Integer id) {
		return equipeService.getEquipeById(id);
	}

	@RequestMapping(value = "equipe/rest/getAll", method = RequestMethod.GET)
	public List<Equipe> getEquipes() {
		return equipeService.getAllEquipes();
	}

	@RequestMapping(value = "equipe/rest/insert", method = RequestMethod.POST)
	public void insertEquipe(@RequestBody Equipe equipe) {
		equipeService.insertEquipe(equipe);
	}
	
}
