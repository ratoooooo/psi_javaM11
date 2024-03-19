package Exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio3ArrayLis {

	public static void main(String[] args) {
        int op = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();
        String nome;
        
        do {
            menu();
            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1:
                    nome = getNome(ler, "Insira o nome do novo aluno:");
                    alunos.add(nome);
                    break;
                case 2:
                    nome = getNome(ler, "Insira o nome do aluno:");
                    if (alunos.contains(nome)) {
                        int index = alunos.indexOf(nome);
                        String novoNome = getNome(ler, "Insira o novo nome do aluno:");
                        alunos.set(index, novoNome);
                        System.out.println("Nome do aluno alterado com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    nome = getNome(ler, "Insira o nome do aluno que deseja ver:");
                    boolean encontrado = false;
                    for (String aluno : alunos) {
                        if (aluno.contains(nome)) {
                            System.out.println(aluno);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("O aluno não está na turma.");
                    }
                    break;

                case 4:
                    alunos.sort(Comparator.comparing(String::toLowerCase));
                    for (String verAlunos : alunos) {
                        System.out.println(verAlunos);
                    }
                    break;

                case 5:
                	nome = getNome(ler, "Insira o nome do aluno que deseja remover da turma");
                    for (String aluno : alunos) {
                    	if (alunos.contains(nome)) {
                            alunos.remove(aluno);
                            System.out.println("Aluno removido com sucesso.");
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println("1 - Adicionar novo Aluno");
        System.out.println("2 - Alterar um aluno existente");
        System.out.println("3 - Pesquisar alunos");
        System.out.println("4 - Ver uma listagem de todos os alunos (ordenados alfabeticamente)");
        System.out.println("5 - Remover um aluno existente");
        System.out.println("0 - Sair");
		
	}
    
	public static String getNome(Scanner ler, String mensagem) {
		String nome;
		do {
			try {
				System.out.println(mensagem);
				nome = ler.nextLine();
				return nome;
			} catch (Exception e) {
				System.out.println("Ocorreu um erro. Tente novamente.");
			}
		} while (true);
	}

}
