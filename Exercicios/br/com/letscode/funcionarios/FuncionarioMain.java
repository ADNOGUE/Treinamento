package br.com.letscode.funcionarios;

public class FuncionarioMain {
    public static void main(String[] args) {

        Funcionario coordenador = new Funcionario();
        coordenador.nome = "Adriana";
        coordenador.cpf  = "297.218.478.52";
        coordenador.salarioBase = 1000;

        coordenador.imprimirToString();
        

        coordenador.quantidadeDias();



    }
}
