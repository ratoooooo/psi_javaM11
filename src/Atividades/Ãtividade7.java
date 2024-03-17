package Atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Ãtividade7 {

	public static void main(String[] args) {
		String[] nomes = {"Dinis", "Rato", "Carlos", "Afonso"};
		ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Dinis", "Carlos", "Rato", "Cesar"));
		
		System.out.println(nomes[0]);
		System.out.println(nomes2.get(0));
		System.out.println();
		
		//Nao podemos remover nos arrays normais~
		
		//podemos remover nos array list
		nomes2.remove(0);
		System.out.println(nomes2.get(0));
		
		nomes2.remove("Carlos");
		System.out.println(nomes2.get(0));
		
		nomes2.removeFirst();
		System.out.println(nomes2.get(0));
		

	}

}
