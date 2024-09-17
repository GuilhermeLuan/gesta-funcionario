package br.com.empresa.funcionarios;

public class Estagiario extends Funcionario {
    //atributo da classe estagiario

    private double valorValeAlimentacao;

    //construtor

    public Estagiario(String nome, int id, double salarioPorHora, String cpf, String email,
                      double horasTrabalhadasNoMes, double valorValeAlimentacao) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.valorValeAlimentacao = valorValeAlimentacao;
    }

    //metodo da classe estagiario
    public double getValorValeAlimentacao() {
        return valorValeAlimentacao;
    }

    //polimorfismo de um metodo da classe base na sub-classe estagiario
    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println("Estagiario");
        System.out.println(" - Valor vale alimentacao: " + valorValeAlimentacao);

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorValeAlimentacao;
    }
}
