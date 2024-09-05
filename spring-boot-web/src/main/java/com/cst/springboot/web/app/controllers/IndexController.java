package com.cst.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cst.springboot.web.app.models.Usuario;

@Controller // ctrl + espacio (para importar)
@RequestMapping("/app") // Ruta de primer nivel para acceder a los métodos.
public class IndexController {

	@GetMapping("/index") // Por defecto es método get con RequestMapping
	public String index(Model model) { // ({"/index","/","/home"}) multiples mapeos
		model.addAttribute("titulo","Este es un mensaje desde un atributo...");
		return "index";
	}
	
	@RequestMapping("/perfil") // Crear primero models.Usuario.java
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Erick");
		usuario.setApellido("Becker");
		usuario.setEmail("becker@gmail.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("Listando usuarios:");
		List<Usuario> usuarios = new ArrayList<>();
		
		// Primero probar sin elementos:
		usuarios.add(new Usuario("Erick","Becker","eri11@gmail.com"));
		usuarios.add(new Usuario("Laura","Sanchez","lau10@gmail.com"));
		
		// Luego optimizar el código con Arrays.asList( new ..., new...);
		
		model.addAttribute("usuarios",usuarios);
		return "listar";
	}
	
}
