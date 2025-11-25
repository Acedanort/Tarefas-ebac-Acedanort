// Arquivo: Pessoa.java
public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void exibirInformacoes();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
// Arquivo: PessoaFisica.java
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String telefone, 
                       String email, String cpf, String dataNascimento) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Pessoa Física ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }

    // Getters e Setters específicos
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
// Arquivo: PessoaJuridica.java
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public PessoaJuridica(String nome, String endereco, String telefone, 
                         String email, String cnpj, String inscricaoEstadual) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Pessoa Jurídica ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        System.out.println("CNPJ: " + this.cnpj);// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma Pessoa Física
        PessoaFisica pf = new PessoaFisica(
            "João Silva",
            "Rua A, 123",
            "(11) 9999-8888",
            "joao@email.com",
            "123.456.789-00",
            "15/05/1990"
        );

        // Criando uma Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(
            "Empresa XYZ Ltda",
            "Av. B, 456",
            "(11) 7777-6666",
            "contato@xyz.com",
            "00.000.000/0001-00",
            "123.456.789.012"
        );

        // Exibindo informações
        pf.exibirInformacoes();
        System.out.println();
        pj.exibirInformacoes();

        // Demonstração de polimorfismo
        System.out.println("\n=== Demonstração de Polimorfismo ===");
        Pessoa[] pessoas = {pf, pj};
        
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
            System.out.println("---------------");
        }
// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma Pessoa Física
        PessoaFisica pf = new PessoaFisica(
            "João Silva",
            "Rua A, 123",
            "(11) 9999-8888",
            "joao@email.com",
            "123.456.789-00",
            "15/05/1990"
        );

        // Criando uma Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(
            "Empresa XYZ Ltda",
            "Av. B, 456",
            "(11) 7777-6666",
            "contato@xyz.com",
            "00.000.000/0001-00",
            "123.456.789.012"
        );

        // Exibindo informações
        pf.exibirInformacoes();
        System.out.println();
        pj.exibirInformacoes();

        // Demonstração de polimorfismo
        System.out.println("\n=== Demonstração de Polimorfismo ===");
        Pessoa[] pessoas = {pf, pj};
        
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
            System.out.println("---------------");
        }
    }
}