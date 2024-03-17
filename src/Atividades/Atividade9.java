package Atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade9 {
	public static void main(String[] args) {
		String[] nomes = {"Dinis", "Rato", "Carlos", "Afonso"};
		ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Dinis", "Carlos", "Rato", "Cesar"));

		for (int j = 0; j < nomes.length; j++) {
			System.out.println(nomes[j]);
		}
		
		System.out.println();
		
		for (int j = 0; j < nomes2.size(); j++) {
			System.out.println(nomes2.get(j));
		}
		
		System.out.println();
		
		for(String nome : nomes2)
		{
			System.out.println(nome);
		}
		
	}
}
