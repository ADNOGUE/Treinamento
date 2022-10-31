package br.com.letscode.funcionarios;

import java.util.Scanner;


public class FuncionarioMain {
    public static void main(String[] args) {

        Funcionario coordenador = new Funcionario();
        coordenador.nome = "Adriana";
        coordenador.cpf  = "297.218.478.52";
        coordenador.salarioBase = 1000;

        Funcionario gerente = new Funcionario();
        gerente.nome = "Rodrigo";
        gerente.cpf  = "299.288.498.55";
        gerente.salarioBase = 20000;

        coordenador.imprimirToString();
        gerente.imprimirToString();

        if ( coordenador.equals(gerente) ) { //comparacao de objetos
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( coordenador == gerente ) { // CUIDADO!! comparacao de referencia de memoria
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( coordenador.toString().equals(gerente.toString()) ) { //comparacao do toString
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( coordenador.hashCode() == gerente.hashCode() ) { // comparacao de hashCode
            System.out.println("hash sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( gerente instanceof Funcionario) {
            System.out.println("gerente é Funcionario");
        }

        if ( coordenador instanceof Funcionario ) {
            System.out.println("coordenador é Funcionario");
        }

        if ( gerente instanceof Object ) {
            System.out.println("gerente é um Object");
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a quantidade de dias trabalhados: ");
        int qtdDias = entrada.nextInt();

        coordenador.calculaSalario(qtdDias);




    }
}
