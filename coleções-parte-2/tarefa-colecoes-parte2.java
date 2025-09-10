import java.util.ArrayList;
import java.util.Scanner;

public class SeparadorPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Listas para armazenar os nomes por gênero
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        
        System.out.println("Digite os nomes e sexos no formato: nome - sexo (m/f)");
        System.out.println("Digite 'sair' para finalizar a entrada de dados");
        
        while (true) {
            System.out.print("Digite o nome e sexo: ");
            String entrada = scanner.nextLine();
            
            // Verificar se o usuário quer sair
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            
            // Separar o nome do sexo usando split
            String[] partes = entrada.split("-");
            
            // Verificar se a entrada está no formato correto
            if (partes.length != 2) {
                System.out.println("Formato inválido! Use: nome - sexo (m/f)");
                continue;
            }
            
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toLowerCase();
            
            // Adicionar à lista correspondente
            if (sexo.equals("m")) {
                masculino.add(nome);
                System.out.println(nome + " adicionado ao grupo masculino.");
            } else if (sexo.equals("f")) {
                feminino.add(nome);
                System.out.println(nome + " adicionado ao grupo feminino.");
            } else {
                System.out.println("Sexo inválido! Use 'm' para masculino ou 'f' para feminino.");
            }
        }
        
        // Exibir os resultados
        System.out.println("\n--- RESULTADOS ---");
        
        System.out.println("\nGrupo Masculino:");
        if (masculino.isEmpty()) {
            System.out.println("Nenhuma pessoa no grupo masculino.");
        } else {
            for (String nome : masculino) {
                System.out.println("- " + nome);
            }
        }
        
        System.out.println("\nGrupo Feminino:");
        if (feminino.isEmpty()) {
            System.out.println("Nenhuma pessoa no grupo feminino.");
        } else {
            for (String nome : feminino) {
                System.out.println("- " + nome);
            }
        }
        
        scanner.close();
    }
}