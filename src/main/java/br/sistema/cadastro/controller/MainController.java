package br.sistema.cadastro.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String login(Model model, HttpServletRequest request) {
		String mensagem = request.getParameter("mensagem");
		model.addAttribute("mensagem", mensagem);
		return "login";
	}
}
