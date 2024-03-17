package Atividades;

public class Teste4 {
	public static void main (String []args) {
		String valor;
		valor = getValor();
		System.out.println (valor);
	}
	public static String getValor () {
		try {
			explode();
			return "1";
		}
		catch ( RuntimeException e ) {
			System.out.println ("RuntimeExplode: "+ e.getMessage());
		}
		
		finally {
			return "2";
		}
		
	}
	public static void explode() {
		throw new RuntimeException();
	}
}