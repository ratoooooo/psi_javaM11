package Exercicios;
import java.util.Scanner;

public class Exercicio1Array {

    public static void main(String[] args) {
        String[] alunos = {"Afonso Miguel", "Afonso Nogueira", "Afonso Domingos", "Amilcar", "Bruno", "David Demetrio", "David Santos", "David Ezequiel", "Dinis", "Diogo", "Fabio Porto", "Fabio Grilo", "Gustavo", "Jose", "Lucas", "Matilde", "Rodrigo", "Salvador"};
        Scanner ler = new Scanner(System.in);

        String nome = getNome(ler, "Insira o nome do aluno que deseja verificar se está na turma:");
        
        boolean alunoAchado = false;

        for (String nomeAluno : alunos) {
            if (nome.equals(nomeAluno)) {
                alunoAchado = true;
                break;
            }
        }

        if (alunoAchado) {
            System.out.println("Esse aluno existe na turma.");
        } else {
            System.out.println("Não existe esse aluno na turma.");
        }
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
