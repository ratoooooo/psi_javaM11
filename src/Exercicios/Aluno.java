package Exercicios;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
    @Override
    public String toString() {
        return "Aluno: " + nome +
        		"\nNota 1: " + nota1 +
        		"\nNota 2: " + nota2 + 
        		"\nNota 3: " + nota3;
    }
	
	
}
