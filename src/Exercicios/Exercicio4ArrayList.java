package Exercicios;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio4ArrayList {

    public static void main(String[] args) {
        int op = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String nome;
        double nota1, nota2, nota3;

        do {
            menu();
            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1:
                    Aluno novoAluno = new Aluno();
                    nome = getNome(ler, "Insira o nome do novo aluno:");
                    novoAluno.setNome(nome);
                    alunos.add(novoAluno);
                    System.out.println("Insira as 3 notas do aluno:");

                    nota1 = ler.nextDouble();
                    novoAluno.setNota1(nota1);

                    nota2 = ler.nextDouble();
                    novoAluno.setNota2(nota2);

                    nota3 = ler.nextDouble();
                    novoAluno.setNota3(nota3);

                    break;
                case 2:
                	nome = getNome(ler, "Insira o nome do aluno:");
                    nome = ler.nextLine();
                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equalsIgnoreCase(nome)) {
                            System.out.println("Insira o novo nome do aluno:");
                            String novoNome = ler.nextLine();
                            aluno.setNome(novoNome);
                            break;
                        }
                    }
                    break;
                case 3:
                	nome = getNome(ler, "Insira o nome do aluno que deseja ver:");
                    boolean encontrado = false;
                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equalsIgnoreCase(nome)) {
                            System.out.println("O aluno está na turma.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("O aluno não está na turma.");
                    }
                    break;
                case 4:
                    alunos.sort(Comparator.comparing(a -> a.getNome().toLowerCase()));
                    for (Aluno verAlunos : alunos) {
                        System.out.println(verAlunos);
                    }
                    break;

                case 5:
                	nome = getNome(ler, "Insira o nome do aluno que deseja remover da turma");
                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equalsIgnoreCase(nome)) {
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
