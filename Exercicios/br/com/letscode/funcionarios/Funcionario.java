package br.com.letscode.funcionarios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Set;


public class Funcionario {

    //atributos
    private String nome;
    private String cpf;
    private BigDecimal salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, String cpf, BigDecimal salarioBase){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalarioBase(salarioBase);
    }

    public void calculaSalario(int qtdDias) {


        BigDecimal salarioDia = (salarioBase.divide(new BigDecimal("30"), RoundingMode.HALF_UP));
        BigDecimal salarioProporcional = salarioDia.multiply(BigDecimal.valueOf(qtdDias));
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


