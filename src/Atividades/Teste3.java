package Atividades;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste3 {
	public static void explode () {
		//System.out.println( 1/0 );
		//int[] a = {2, 22}; System.out.println(a[-1]);
		//String a = null; a.toLowerCase();
		throw new RuntimeException();
	}
	public static void main (String []args) {
		
		try {
			explode();
			File f = new File("fich.ext");
			FileReader fr = new FileReader(f);
			fr.close();
			
		}
		/*
		catch ( ArithmeticException e ) {
			System.out.println ("1. Arithmetic Exception: "+ e.getMessage());
		}
		catch ( IndexOutOfBoundsException e ) {
			System.out.println ("2. Index Out Of Bounds Exception: "+ e.getMessage());
			}
		catch ( NullPointerException e ) {
			System.out.println ("3. Null Pointer Exception: "+ e.getMessage());
			}
		catch ( RuntimeException e ) {
			System.out.println ("4. Runtime Exception: "+ e.getMessage());
			}
			*/
		
		catch ( IOException e ) {
			System.out.println ("5. IO Exception: "+ e.getMessage());
			}
		//convem deixar caso nao achemos nehuma execaorecomendada
		catch ( Exception e ) {
			System.out.println ("6. Exceção: "+ e.getMessage());
			}
		finally {
			System.out.println ("Código executado sempre!");
			}






	}
}