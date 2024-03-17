package Atividades;

public class Teste2 {
	public static void explode()throws MinhaExecao {
		throw new RuntimeException();
	}
	public static void main (String []args) {
		try {
			explode();
		}
		catch ( RuntimeException e ) {
			System.out.println ("RuntimeExplode"+ e.getMessage());
		}
		catch ( MinhaExecao e ) {
			System.out.println ("Minha exeção"+ e.getMessage());
		}
		
	}
}
