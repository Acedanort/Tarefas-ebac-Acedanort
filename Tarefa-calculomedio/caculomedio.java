public class CalculadoraMedia {
    
    // Método para calcular a média de 4 notas
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das 4 notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = CalculadoraMedia.calcularMedia(nota1, nota2, nota3, nota4);

        // Exibição do resultado
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}