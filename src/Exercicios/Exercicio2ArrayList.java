package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2ArrayList {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Romeu", "Afonso Miguel", "Afonso Nogueira","Afonso Domingos", "Amilcar", "Bruno", "David Demetrio", "David Santos", "David Ezequiel", "Dinis", "Diogo", "Fabio Porto", "Fabio Grilo", "Gustavo", "Jose", "Lucas", "Matilde", "Rodrigo", "Salvador"));
		
		alunos.sort(null);
		
        System.out.println("Alunos da turma");
        for(String nomes: alunos)
        {
        	System.out.println(nomes);
        }

	}

}
