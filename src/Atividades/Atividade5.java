package Atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade5 {

	public static void main(String[] args) {
		
		String[] nomes = {"Dinis", "Rato", "Carlos", "Afonso"};
		ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Dinis", "Carlos", "Rato", "Cesar"));

		System.out.println(nomes.length);
		System.out.println(nomes2.size());
	}

}
