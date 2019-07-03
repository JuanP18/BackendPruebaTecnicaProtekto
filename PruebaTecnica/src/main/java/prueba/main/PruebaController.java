package prueba.main;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import prueba.model.Generador;


@RestController
public class PruebaController 
{
	
	@RequestMapping(value="generarClave", method = RequestMethod.GET)
	public  Map<String, String> generateRamdonStringApi(@RequestParam int numero)
	{
	     Generador clave = new Generador();
	     return clave.generateRamdonString(numero);
	}
	@RequestMapping(value = "generarClave2", method = RequestMethod.GET)
    public  Map<String, String> generateRamdonStringApi2(@RequestParam int numero)
    {    
		Generador clave = new Generador();
        return clave.generarStringAleatorios(numero);
    }
	  @RequestMapping("/")
	    public String home(){
	        return "Inicia el web service de la aplicación";
	    }

}
