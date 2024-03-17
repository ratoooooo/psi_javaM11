package Atividades;

public class Teste1 {
	public static void explode() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		try {
			explode();
		} catch (RuntimeException e) {
			System.out.println("RuntimeExplode: " + e.getMessage());
		} finally {
			System.out.println("Fim do try..catch!");
		}
	}
}
