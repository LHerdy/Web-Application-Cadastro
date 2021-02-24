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

import br.sistema.cadastro.dao.AlunoRepository;
import br.sistema.cadastro.model.Aluno;


@Controller
public class AlunoController {

	private AlunoRepository repository;

	public AlunoController(AlunoRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/usuario/aluno")
	public String index(Model model) {

		List<Aluno> alunos = this.repository.findAll();

		model.addAttribute("alunos", alunos);
		return "/aluno/alunoIndex";
	}

	@RequestMapping("/aluno/alunoInserir")
	public String inserir(Model model) {
		Aluno aluno = new Aluno();
		model.addAttribute("aluno", aluno);
		return "/aluno/alunoInserir";
	}

	@RequestMapping(value = "/aluno/inserirAction", method = RequestMethod.POST)
	public String inserirAction(@ModelAttribute("aluno") Aluno aluno, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(aluno);

		model.addAttribute("alunos", this.repository.findAll());
		model.addAttribute("mensagem", "Salvo com sucesso!");

		return "/aluno/alunoIndex";
	}

	@RequestMapping("/aluno/alterarAluno/{id}")
	public String alterar(Model model, @PathVariable(value = "id") int id) {

		Optional<Aluno> aluno = this.repository.findById(id);
		model.addAttribute("aluno", aluno.get());
		return "/aluno/alterarAluno";
	}

	@RequestMapping(value = "/aluno/alterarAction", method = RequestMethod.POST)
	public String alterarAction(@ModelAttribute("aluno") Aluno aluno, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(aluno);
		model.addAttribute("mensagem", "Informação modificada");
		model.addAttribute("alunos", this.repository.findAll());
		return "/aluno/alunoIndex";

	}

	@RequestMapping("/aluno/removerAluno/{id}")
	public String remover(Model model, @PathVariable(value = "id") int id) {
		this.repository.deleteById(id);
		model.addAttribute("mensagem", "Informação excluída");
		model.addAttribute("alunos", this.repository.findAll());
		return "/aluno/alunoIndex";
	}
}

