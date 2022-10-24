package br.com.renatour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.renatour.exception.ClienteNotFoundException;
import br.com.renatour.model.Cliente;
import br.com.renatour.services.ClienteService;

@Controller
public class ApiController {

	@Autowired
	private ClienteService service;

	@GetMapping(value = "/")
	public String home() {
		return "index";
	}

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/promo")
	public String promo() {
		return "promo";
	}

	@GetMapping(value = "/oz")
	public String oz() {
		return "oz";
	}

	@GetMapping(value = "/nz")
	public String nz() {
		return "nz";
	}

	@GetMapping(value = "/contato")
	public String contato() {
		return "contato";
	}

	@GetMapping(value = "/form")
	public String form() {
		return "form";
	}

	@GetMapping("/register")
	public String showRegistration() {
		return "registerClientePage";
	}

	@PostMapping("/save")
	public String saveCliente(@ModelAttribute Cliente cliente, Model model) {
		service.saveCliente(cliente);
		Long id = service.saveCliente(cliente).getId();
		String message = "Dado com id : '" + id + "' foi salvo com sucesso!";
		model.addAttribute("message", message);
		return "confCompra";
	}
	/*
	 * @GetMapping("/getAllClientes") public String
	 * getAllClientes(@RequestParam(value = "message", required = false) String
	 * message, Model model) { List<Cliente> cliente = service.getAllClientes();
	 * model.addAttribute("cliente", cliente); model.addAttribute("message",
	 * message); return "allClientesPage"; }
	 */

	@GetMapping("/getAllClientes")
	public String getAllClientes(Model model) {
		List<Cliente> cliente = service.getAllClientes();
		model.addAttribute("clientes", cliente);
		return "allClientesPage";
	}

	@GetMapping("/edit")
	public String getEditPage(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page = null;
		try {
			Cliente Cliente = service.getClienteById(id);
			model.addAttribute("cliente", Cliente);
			page = "editClientePage";
		} catch (ClienteNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:getAllClientes";
		}
		return page;
	}

	@PostMapping("/update")
	public String updateCliente(@ModelAttribute Cliente cliente, RedirectAttributes attributes) {
		service.updateCliente(cliente);
		Long id = cliente.getId();
		attributes.addAttribute("message", "Cliente com id: '" + id + "' foi atualizado com sucesso!");
		return "redirect:/getAllClientes";
	}

	@GetMapping("/delete")
	public String deleteCliente(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deleteClienteById(id);
			attributes.addAttribute("message", "Cliente com Id : '" + id + "' foi deletado com sucesso!");
		} catch (ClienteNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:/getAllClientes";
	}
}