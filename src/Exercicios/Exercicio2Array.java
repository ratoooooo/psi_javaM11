package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2Array {

	public static void main(String[] args) {
        String[] alunos = {"Afonso Miguel", "Afonso Nogueira", "Afonso Domingos", "Amilcar", "Bruno", "David Demetrio", "David Santos", "David Ezequiel", "Dinis", "Diogo", "Fabio Porto", "Fabio Grilo", "Gustavo", "Jose", "Lucas", "Matilde", "Rodrigo", "Salvador"};
        Scanner ler = new Scanner(System.in);
        
        Arrays.sort(alunos);
        
        System.out.println("Alunos da turma");
        for(String nomes: alunos)
        {
        	System.out.println(nomes);
        }

	}

}
