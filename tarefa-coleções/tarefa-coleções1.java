import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenadorNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os nomes separados por vírgulas:");
        String input = scanner.nextLine();
        
        // Usando split para separar os nomes pela vírgula
        String[] nomesArray = input.split(",");
        
        // Criando um ArrayList para armazenar os nomes
        ArrayList<String> listaNomes = new ArrayList<>();
        
        // Adicionando cada nome ao ArrayList, removendo espaços em branco
        for (String nome : nomesArray) {
            listaNomes.add(nome.trim()); // trim() remove espaços antes e depois
        }
        
        // Ordenando a lista em ordem alfabética
        Collections.sort(listaNomes);
        
        // Imprimindo os nomes ordenados
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}