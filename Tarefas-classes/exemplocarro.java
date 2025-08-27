/**
 * Classe que representa um carro do mundo real, contendo propriedades comuns
 * como marca, modelo, cor, ano de fabricação e número de portas.
 */
public class Carro {
    // Propriedades do carro
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, String cor, int anoFabricacao, int numeroPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
    }

    // Métodos Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public int getNumeroPortas() { return numeroPortas; }

    // Método toString para representação em string
    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anoFabricacao + ") - " + cor;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Carro meuCarro = new Carro(
            "Volkswagen",
            "Golf GTI",
            "Vermelho",
            2022,
            4
        );
        
        System.out.println(meuCarro); // Saída: Volkswagen Golf GTI (2022) - Vermelho
    }
}