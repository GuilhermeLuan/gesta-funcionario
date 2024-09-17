package br.com.empresa.funcionarios;

// atributos da classe

public class Funcionario {
    private String nome;
    private int id;
    private double salarioPorHora;
    private String cpf;
    private String email;
    private double horasTrabalhadasNoMes;

    // constructor da classe

    public Funcionario(String nome, int id, double salarioPorHora, String cpf, String email, double horasTrabalhadasNoMes) {
        super();
        this.nome = nome;
        this.id = id;
        this.salarioPorHora = salarioPorHora;
        this.cpf = cpf;
        this.email = email;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }

    // encapsulamento da classe funcionarios

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadasNoMes;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadasNoMes = horasTrabalhadas;
    }

    public double calcularSalario() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }

    public void informacoesFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Salário por Hora: R$ " + salarioPorHora);
        System.out.println("Horas Trabalhadas no Mês: " + horasTrabalhadasNoMes);
    }
}