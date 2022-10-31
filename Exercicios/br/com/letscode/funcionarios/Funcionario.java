package br.com.letscode.funcionarios;

import java.util.Objects;



public class Funcionario {

    //atributos
    public String nome;
    public String cpf;
    public double salarioBase;


      public void calculaSalario(int qtdDias) {


        double salarioProporcional = (salarioBase / 30) * qtdDias;
        System.out.printf("o salário proporcional é R$  %.2f ",  salarioProporcional);

    }

    void imprimirToString() {
        System.out.println("this = " + this.toString()); //imprime o toString implementado nessa classe
        System.out.println("super = " + super.toString()); //imprime o toString da classe PAI Object
        System.out.println("hash this = " + this.hashCode()); //imprime o hashCode implementado nessa classe
        System.out.println("hash super = " + super.hashCode()); //imprime o hashCode da classe PAI Object
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", salarioBase='").append(salarioBase).append('\'');
        sb.append('}');
        return sb.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, salarioBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(nome, funcionario.nome) && Objects.equals(cpf, funcionario.cpf) && Objects.equals(salarioBase, funcionario.salarioBase);
    }

}


