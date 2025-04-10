/**
 * Classe que representa um carro do mundo real.
 * Propriedades: marca, modelo, cor, ano, velocidadeAtual, combustivel.
 * Métodos: acelerar, frear, buzinar, verificarCombustivel, abastecer.
 */
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int velocidadeAtual;
    private double combustivel;

    // Construtor
    public Carro(String marca, String modelo, String cor, int ano, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.combustivel = combustivel;
    }

    // Métodos
    public void acelerar(int aumentoVelocidade) {
        if (combustivel > 0) {
            velocidadeAtual += aumentoVelocidade;
            combustivel -= 0.1 * aumentoVelocidade; // Consome 0.1L por unidade de velocidade
            System.out.printf("Acelerando! Velocidade atual: %d km/h\n", velocidadeAtual);
        } else {
            System.out.println("Sem combustível! Não é possível acelerar.");
        }
    }

    public void frear(int reducaoVelocidade) {
        velocidadeAtual = Math.max(0, velocidadeAtual - reducaoVelocidade);
        System.out.printf("Freando! Velocidade atual: %d km/h\n", velocidadeAtual);
    }

    public String buzinar() {
        return "Biiiiiipe!";
    }

    public void verificarCombustivel() {
        System.out.printf("Combustível restante: %.1fL\n", combustivel);
    }

    public void abastecer(double litros) {
        double capacidadeMaxima = 50.0;
        if (combustivel + litros <= capacidadeMaxima) {
            combustivel += litros;
            System.out.printf("Abastecido! Combustível: %.1fL\n", combustivel);
        } else {
            System.out.printf("Erro: Tanque suporta no máximo %.1fL.\n", capacidadeMaxima);
        }
    }

    // Método main para teste
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Fiesta", "Vermelho", 2020, 10.0);
        
        meuCarro.acelerar(20);
        meuCarro.verificarCombustivel();
        System.out.println(meuCarro.buzinar());
        meuCarro.abastecer(30);
    }
} 