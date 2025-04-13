/**
 * Classe que representa uma Lâmpada do mundo real.
 * Propriedades: marca, potenciaWatts, corLuz, estaLigada.
 * Métodos: ligar, desligar, verificarEstado.
 */
public class Lampada {
    // Propriedades
    private String marca;
    private int potenciaWatts;
    private String corLuz;
    private boolean estaLigada;

    // Construtor
    public Lampada(String marca, int potenciaWatts, String corLuz) {
        this.marca = marca;
        this.potenciaWatts = potenciaWatts;
        this.corLuz = corLuz;
        this.estaLigada = false; // Começa desligada
    }

    // Métodos
    public void ligar() {
        if (!estaLigada) {
            estaLigada = true;
            System.out.println("Lâmpada ligada!");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar() {
        if (estaLigada) {
            estaLigada = false;
            System.out.println("Lâmpada desligada!");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    public void verificarEstado() {
        String estado = estaLigada ? "ligada" : "desligada";
        System.out.printf("Estado: %s | Cor: %s | Potência: %dW\n", estado, corLuz, potenciaWatts);
    }

    // Método main para teste
    public static void main(String[] args) {
        Lampada minhaLampada = new Lampada("Philips", 15, "Branca Quente");
        
        minhaLampada.verificarEstado();
        minhaLampada.ligar();
        minhaLampada.verificarEstado();
        minhaLampada.desligar();
    }
}