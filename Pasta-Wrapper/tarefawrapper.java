import java.util.Scanner;

public class ConversorWrapper {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê um valor numérico inteiro
        System.out.print("Digite um valor inteiro: ");
        int valorPrimitivo = scanner.nextInt();
        
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        
        // Converte para o tipo wrapper (autoboxing)
        Integer valorWrapper = valorPrimitivo;
        
        // Imprime o valor do wrapper
        System.out.println("Valor convertido para wrapper: " + valorWrapper);
    }
}