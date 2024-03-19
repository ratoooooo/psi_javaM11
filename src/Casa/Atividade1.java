package Casa;

import java.util.ArrayList;

public class Atividade1 {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Imprimindo a lista
        System.out.println("Lista inicial: " + lista);

        // Acessando um elemento pelo índice
        String elemento = lista.get(0);
        System.out.println("Elemento no índice 0: " + elemento);

        // Removendo um elemento
        lista.remove(1);
        System.out.println("Lista após remover o elemento no índice 1: " + lista);

        // Verificando o tamanho da lista       
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + (tamanho+1));

        // Verificando se a lista está vazia
        boolean vazia = lista.isEmpty();
        System.out.println("A lista está vazia? " + vazia);

        // Verificando se a lista contém um elemento específico
        boolean contemElemento = lista.contains("Elemento 3");
        System.out.println("A lista contém 'Elemento 3'? " + contemElemento);

        // Encontrando o índice de um elemento
        int indice = lista.indexOf("Elemento 3");
        System.out.println("O índice de 'Elemento 3' na lista: " + indice);

        // Convertendo a lista em um array
        String[] array = lista.toArray(new String[0]);
        System.out.print("Array criado a partir da lista: [");
        for (String item : array) {
            System.out.print(item + ", ");
        }
        System.out.println("]");
        
        // Limpando a lista
        lista.clear();
        System.out.println("Lista após limpar: " + lista);
    }
}
