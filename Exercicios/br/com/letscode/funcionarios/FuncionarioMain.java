package br.com.letscode.funcionarios;

import java.util.Scanner;
import java.util.Formatter;

public class FuncionarioMain {
    public static void main(String[] args) {

        Funcionario coordenador = new Funcionario();
        coordenador.nome = "Adriana";
        coordenador.cpf  = "297.218.478.52";
        coordenador.salarioBase = 1000;

        coordenador.imprimirToString();


        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a quantidade de dias trabalhados: ");
        int qtdDias = entrada.nextInt();

        coordenador.calculaSalario(qtdDias);




    }
}
