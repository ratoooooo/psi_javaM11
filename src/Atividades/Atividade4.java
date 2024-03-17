package Atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade4 {

	public static void main(String[] args) {
		String[] nomes = {"Dinis", "Rato", "Carlos", "Afonso"};
		ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Dinis", "Carlos", "Rato", "Cesar"));

		System.out.println(nomes[1]);
		System.out.println(nomes2.get(1));
		
		nomes[1] = "Pedro";
		nomes2.set(1, "Pedro");
		
		System.out.println(nomes[1]);
		System.out.println(nomes2.get(1));
	}
}
