/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistema.cadastro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.sistema.cadastro.dao.TurmaRepository;
import br.sistema.cadastro.model.Turma;

@Controller
public class TurmaController {
    
    private TurmaRepository repository;
    
    public TurmaController(TurmaRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/usuario/turma")
    public String index(Model model) {
        
        List<Turma> turmas = this.repository.findAll();
        
        model.addAttribute("turmas", turmas);
        return "/turma/turmaIndex";
    }
    
    @RequestMapping("/turma/turmaInserir")
    public String inserir(Model model){
        Turma turma = new Turma();
        model.addAttribute("turma", turma);
        return "/turma/turmaInserir";
    }
    
    @RequestMapping(value = "/turma/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("turma") Turma turma, 
            BindingResult result,
            ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        
        this.repository.save(turma);
        
        model.addAttribute("turmas", this.repository.findAll());
        model.addAttribute("mensagem", "Armazenado");
        
        return "/turma/turmaIndex";
    }
    
    @RequestMapping("/turma/alterarTurma/{id}")
	public String alterar(Model model, @PathVariable(value = "id") int id) {

		Optional<Turma> turma = this.repository.findById(id);
		model.addAttribute("turma", turma.get());
		return "/turma/alterarTurma";
	}

	@RequestMapping(value = "/turma/alterarAction", method = RequestMethod.POST)
	public String alterarAction(@ModelAttribute("turma") Turma turma, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(turma);
		model.addAttribute("mensagem", "Informação modificada");
		model.addAttribute("turmas", this.repository.findAll());
		return "/turma/turmaIndex";

	}

	@RequestMapping("/turma/removerTurma/{id}")
	public String remover(Model model, @PathVariable(value = "id") int id) {
		this.repository.deleteById(id);
		model.addAttribute("mensagem", "Informação excluída");
		model.addAttribute("turmas", this.repository.findAll());
		return "/turma/turmaIndex";
	}
}

