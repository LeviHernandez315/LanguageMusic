package unah.lenguajes.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.services.impl.RecibosServiceImpl;

@RestController
@RequestMapping("/api/canciones")
public class ReciboController {
	
	@Autowired
	private RecibosServiceImpl recServImpl;
	
	//@PostMapping("/guardar")
	//@RequestBody
	//
	//@GetMapping("/eliminar/{idCancion}")
	//@PathVariable(name="idCancion")
}
