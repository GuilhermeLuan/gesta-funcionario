package br.com.empresa.funcionarios.main;

import br.com.empresa.funcionarios.Desenvolvedor;
import br.com.empresa.funcionarios.Estagiario;
import br.com.empresa.funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {
        // Instanciando a classe Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor(
                "Lucas Oliveira", 202, 100.0, "123.456.789-00", "lucas.oliveira@email.com",
                160.0, "Java", "Spring", "pleno"
        );

        //Exibi as informacoes
        System.out.println("Desenvolvedor");
        dev.informacoesFuncionario();
        // Calculando e exibindo o salário
        System.out.printf("Salário total: R$ %.2f%n",dev.calcularSalario());

        System.out.println("========================");

        Gerente gerente = new Gerente(
                "Ana Sousa", 301, 150.0, "321.654.987-00", "ana.sousa@email.com",
                180.0, 5000.0, 10
        );

        // Exibindo as informações do gerente
        System.out.println("Gerente");
        gerente.informacoesFuncionario();

        // Calculando e exibindo o salário
        System.out.printf("Salário total: R$ %.2f%n",gerente.calcularSalario());

        System.out.println("========================");


        Estagiario estagiario = new Estagiario(
                "Pedro Alves", 401, 30.0, "654.987.123-00", "pedro.alves@email.com",
                120.0, 300.0
        );

        // Exibindo as informações do estagiário
        System.out.println("Estagiario");

        estagiario.informacoesFuncionario();

        // Calculando e exibindo o salário
        System.out.printf("Salário total: R$ %.2f%n",estagiario.calcularSalario());
    }
}
