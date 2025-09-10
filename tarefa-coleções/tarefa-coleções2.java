import java.util.ArrayList;
import java.util.Scanner;

public class SeparadorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os nomes e gêneros no formato: Nome - g, Nome - g");
        System.out.println("Exemplo: Arthur - m, Luana - f, João - m, Maria - f");
        String input = scanner.nextLine();
        
        // Separar os pares nome-gênero pela vírgula
        String[] pares = input.split(",");
        
        // Criar listas para cada gênero
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        
        // Processar cada par nome-gênero
        for (String par : pares) {
            // Remover espaços em branco e dividir pelo hífen
            String[] partes = par.trim().split("-");
            
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toLowerCase(); // Converter para minúsculo
                
                // Adicionar à lista correspondente
                if (genero.equals("m")) {
                    masculino.add(nome);
                } else if (genero.equals("f")) {
                    feminino.add(nome);
                }
            }
        }
        
        // Imprimir os resultados
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}