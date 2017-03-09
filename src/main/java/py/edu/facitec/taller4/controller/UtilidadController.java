package py.edu.facitec.taller4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//indica a spring que se trata de una clase 
//que gestionara las peticiones y respuestas de la pagina
@Controller
public class UtilidadController {
	
	//lo que se escribe en el navegador
	@RequestMapping("/comollegar")
	
	public String index(){
	//para saber si ingreso a la peticion "/"
	System.out.println("la página esta cargada");
	
	//pagina a responder
	return "comollegar";
	}

}
