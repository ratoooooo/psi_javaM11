package Atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Atividade10 {

	public static void main(String[] args) {
		String[] nomes = {"Dinis", "Rato", "Carlos", "Afonso"};
		ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Dinis", "Carlos", "Rato", "Cesar"));
		int i = 0;
		
		while (	i < nomes.length) {
			System.out.println(nomes[i]);
			i++;
		}
		
		i=0;
		while (i< nomes2.size()) {
			System.out.println(nomes2.get(i));
		}
		
		Iterator iterator = nomes2.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
