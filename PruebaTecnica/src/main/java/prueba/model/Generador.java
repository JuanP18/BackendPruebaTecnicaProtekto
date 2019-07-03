package prueba.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

public class Generador 
{
private String clave;
private char[] alnumesp = {'a', 'b', 'c', 'd','e', 'f','g', 'h','i', 'j','k', 'l','m', 'n','ñ', 'o','p', 'q'
		,'r', 's','t', 'u','v', 'w','x', 'y','z', 'A','B', 'C','D', 'E','F', 'G','H', 'I','J', 'K','L', 'M','N', 'Ñ'
		,'O', 'P','Q', 'R','S', 'T','U', 'V','W', 'X','Y', 'Z','0', '1','2', '3','4', '5','6', '7','8', '9','!'
		,'"','#','$','%','&','\'','(',')','*','+',',','-','.','/',':',';','<','=','>','?','@','[','\\',']','^','_','`','{','|','}','~'};
public Generador() {
 super();
}

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
} 

public Map<String, String> generateRamdonString (int n) 
{
	HashMap<String, String> map = new HashMap<>();
	clave = RandomStringUtils.randomAlphanumeric(n);
	System.out.println(clave);
	 map.put("res", clave);
	return map; 
	}

public Map<String, String> generarStringAleatorios(int n) 
{
	HashMap<String, String> map = new HashMap<>();
	String password ="";
	StringBuilder a = new StringBuilder();
	char actual; 
	for (int i = 0; i < n; i++) 
	{
		int numero = (int) (Math.random() * 94 ) ;
		actual = alnumesp[numero];
		a.append(actual);
	}
	password = a.toString();
	 map.put("res", password);
	System.out.println("generar " + password);
	return map;
	} 

public static void main(String[] args) 
{
    Generador a = new Generador() ;
     a.generateRamdonString(5);
     a.generarStringAleatorios(5);
}

}
