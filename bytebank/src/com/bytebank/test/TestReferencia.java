package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestReferencia {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();		//(primer punto)
		funcionario.setNombre("Lucas");
		System.out.println(funcionario.getNombre());
		//System.out.println(funcionario.setClave("7889"));
		
		//En este primer caso tenemos a funcionario instanciado desde la clase Gerente pero referenciado a la clase mas generica que es 
		//Funcionario. Esto es posible porque la clase Gerente extiende de Funcionario, y podemos decir que todo gerente es un funcionario
		//Las limitantes serian que funcionario solamente tendria acceso a los métodos y atributos de su referncia, en este caso la clase 
		//padre Funcionario, y nunca tendria acceso a los de la clase Gerente.
		
		
		Gerente gerente = new Gerente();
		//Gerente gerente = new Funcionario();			(segundo punto) NO COMPILA
		gerente.setNombre("Carla");
		System.out.println(gerente.getNombre());
		
		//En este segundo caso, no podriamos instanciar un nuevo gerente que tiene como referencia la clase Gerente, utilizando la clase
		//padre Funcionario, pues no compilaria nuestro código. Y esto es por que no todos los funcionarios son gerentes. (segundo punto)
		
		//Ambos conceptos es importante entenderlos porque es la introducción al polimorfismo en Java.
		
		
	}
}
