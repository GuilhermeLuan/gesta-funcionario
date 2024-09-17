package br.com.empresa.funcionarios;

public class Gerente extends Funcionario {

    //atributo do gerente
    private double salarioBonusEmReais;
    private int qtdSubordinados;

    //construtor da classe gerente


    public Gerente(String nome, int id, double salarioPorHora, String cpf, String email, double horasTrabalhadasNoMes, double salarioBonusEmReais, int qtdSubordinados) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.salarioBonusEmReais = salarioBonusEmReais;
        this.qtdSubordinados = qtdSubordinados;
    }

    public double getSalarioBonusEmReais() {
        return salarioBonusEmReais;
    }

    public void setSalarioBonusEmReais(double salarioBonusEmReais) {
        this.salarioBonusEmReais = salarioBonusEmReais;
    }

    public int getQtdSubordinados() {
        return qtdSubordinados;
    }

    public void setQtdSubordinados(int qtdSubordinados) {
        this.qtdSubordinados = qtdSubordinados;
    }

    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println("Gerente");
        System.out.println(" - Bonus salarial: " + salarioBonusEmReais);
        System.out.println(" - Quantidade de subordinado: " + qtdSubordinados);
    }

    //Sobrescrita do metodo calcularSalario e polimorfismo
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + salarioBonusEmReais;
    }


}