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

import br.sistema.cadastro.dao.TurnoRepository;
import br.sistema.cadastro.model.Turno;

@Controller
public class TurnoController {
	
private TurnoRepository repository;
    
    public TurnoController(TurnoRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/usuario/turno")
    public String index(Model model) {
        
        List<Turno> turnos = this.repository.findAll();
        
        model.addAttribute("turnos", turnos);
        return "/turno/turnoIndex";
    }
    
    @RequestMapping("/turno/turnoInserir")
    public String inserir(Model model){
    	Turno turno = new Turno();
        model.addAttribute("turno", turno);
        return "/turno/turnoInserir";
    }
    
    @RequestMapping(value = "/turno/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("turno") Turno turno, 
            BindingResult result,
            ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        
        this.repository.save(turno);
        
        model.addAttribute("turnos", this.repository.findAll());
        model.addAttribute("mensagem", "Armazenado");
        
        return "/turno/turnoIndex";
    }
    
    @RequestMapping("/turno/alterarTurno/{id}")
	public String alterar(Model model, @PathVariable(value = "id") int id) {

		Optional<Turno> turno = this.repository.findById(id);
		model.addAttribute("turno", turno.get());
		return "/turno/alterarTurno";
	}

	@RequestMapping(value = "/turno/alterarAction", method = RequestMethod.POST)
	public String alterarAction(@ModelAttribute("turno") Turno turno, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(turno);
		model.addAttribute("mensagem", "Informação modificada");
		model.addAttribute("turnos", this.repository.findAll());
		return "/turno/turnoIndex";

	}

	@RequestMapping("/turno/removerTurno/{id}")
	public String remover(Model model, @PathVariable(value = "id") int id) {
		this.repository.deleteById(id);
		model.addAttribute("mensagem", "Informação excluída");
		model.addAttribute("turnos", this.repository.findAll());
		return "/turno/turnoIndex";
	}

}
