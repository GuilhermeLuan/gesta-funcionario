//pacote
package br.com.empresa.funcionarios;

public class Desenvolvedor extends Funcionario {
    //atributos - propriedades - características
    private String linguagemDeProgramacao;
    private String framework;
    private String nivelSenioridade;


    //construtor - inicializando os atributos
    public Desenvolvedor(String nome, int id, double salarioPorHora, String cpf, String email,
                         double horasTrabalhadasNoMes, String linguagemDeProgramacao, String framework, String nivelSenioridade) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.framework = framework;
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println(" - Linguagem de programação: " + linguagemDeProgramacao);
        System.out.println(" - Framework: " + framework);
        System.out.println(" - Nivel de Senioridade: " + nivelSenioridade);
    }

    //sobrescrita - polimorfismo do metodo calcularSalario
    @Override
    public double calcularSalario() {
        switch (nivelSenioridade.toLowerCase()) {
            case "junior":
                return super.calcularSalario() * 0.30;
            case "pleno":
                return super.calcularSalario() * 0.75;
            case "senior":
                return super.calcularSalario() * 0.95;
            default:
                return super.calcularSalario();
        }
    }
}