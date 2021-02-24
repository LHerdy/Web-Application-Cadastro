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

import br.sistema.cadastro.dao.DisciplinaRepository;
import br.sistema.cadastro.model.Disciplina;

@Controller
public class DisciplinaController {

	private DisciplinaRepository repository;

	public DisciplinaController(DisciplinaRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/usuario/disciplina")
	public String index(Model model) {

		List<Disciplina> disciplinas = this.repository.findAll();

		model.addAttribute("disciplinas", disciplinas);
		return "/disciplina/disciplinaIndex";
	}

	@RequestMapping("/disciplina/disciplinaInserir")
	public String inserir(Model model) {
		Disciplina disciplina = new Disciplina();
		model.addAttribute("disciplina", disciplina);
		return "/disciplina/disciplinaInserir";
	}

	@RequestMapping(value = "/disciplina/inserirAction", method = RequestMethod.POST)
	public String inserirAction(@ModelAttribute("disciplina") Disciplina disciplina, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(disciplina);

		model.addAttribute("disciplinas", this.repository.findAll());
		model.addAttribute("mensagem", "Salvo com sucesso!");

		return "/disciplina/disciplinaIndex";
	}

	@RequestMapping("/disciplina/alterarDisciplina/{id}")
	public String alterar(Model model, @PathVariable(value = "id") int id) {

		Optional<Disciplina> disciplina = this.repository.findById(id);
		model.addAttribute("disciplina", disciplina.get());
		return "/disciplina/alterarDisciplina";
	}

	@RequestMapping(value = "/disciplina/alterarAction", method = RequestMethod.POST)
	public String alterarAction(@ModelAttribute("disciplina") Disciplina disciplina, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(disciplina);
		model.addAttribute("mensagem", "Informação modificada");
		model.addAttribute("disciplinas", this.repository.findAll());
		return "/disciplina/disciplinaIndex";

	}

	@RequestMapping("/disciplina/removerDisciplina/{id}")
	public String remover(Model model, @PathVariable(value = "id") int id) {
		this.repository.deleteById(id);
		model.addAttribute("mensagem", "Informação excluída");
		model.addAttribute("disciplinas", this.repository.findAll());
		return "/disciplina/disciplinaIndex";
	}
}
