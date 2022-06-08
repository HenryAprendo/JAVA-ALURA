package br.com.alura;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Clase3 {
	public static void main(String[] args) {
		String cursos1 = "Geometria";
		String cursos2 = "Fisica";
		String cursos3 = "Quimica";
		String cursos4 = "Historia";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(cursos1);
		lista.add(cursos2);
		lista.add(cursos3);
		lista.add(cursos4);
		System.out.println(lista);
		
		List<String> cursosList = lista.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
		
		System.out.println(lista);
		lista.sort(Comparator.reverseOrder());
		System.out.println(lista);
		lista.sort(Comparator.naturalOrder());
		System.out.println(lista);
		
		
		//lista.sort((a,b) -> {
			//return a.compareTo(b);
		//});
		
		//Con la clase Collections		
		Collections.sort(lista);
		//System.out.println(lista);
		
		Collections.sort(lista, Collections.reverseOrder());
		//System.out.println(lista);
		
		
	}
}











