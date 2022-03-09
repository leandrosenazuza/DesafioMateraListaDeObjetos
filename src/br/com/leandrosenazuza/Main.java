package br.com.leandrosenazuza;

import java.util.ArrayList;

// Classe pessoa para o desafio envolvendo lista de objetos

public class Main {

    public double mediaIdadeLista(ArrayList<pessoa> listaSomaIdade, int qtdPessoas){
        int somaIdade = 0;
        double mediaIdade = 0;

        //Soma a idade de cada pessoa (objeto) passado e divite pelo número de pessoas
        for (int i = 0; i < qtdPessoas; i++) somaIdade += listaSomaIdade.get(i).getIdade();

        return somaIdade / qtdPessoas;
        
    }

    public double mediaSalarioMulher(ArrayList<pessoa> listaSomaSalarioMulheres, int qtdClientes){
        //Será percorrido todos os valores de cadastro, para fazer a soma dos salários.
        //Apenas salários de mulheres será somados
        double somaSalarioMetodo = 0;
        double contadorMulher = 0;

        for (int i = 0; i < qtdClientes; i++) {
            if(listaSomaSalarioMulheres.get(i).getSexo() == "feminino") {
                somaSalarioMetodo = listaSomaSalarioMulheres.get(i).getSalario() + somaSalarioMetodo;
                contadorMulher++;
            }
        }
        return (somaSalarioMetodo/contadorMulher); // Retorna a média do salário das mulheres
    }

    public double qtdPessoas25e5000(ArrayList<pessoa> listaPessoas, int qtdClientes){
        //Será percorrido todos os valores de cadastro, para verificar o salário dos clientes
        double contador = 0;

        //Pessoas com 25 anos ou com salário de 5000 não são consideradas, uma vez que será considerada apenas maior que esse valor.
        for (int i = 0; i < 10; i++) {
            if(listaPessoas.get(i).getSalario() > 5000 && listaPessoas.get(i).getIdade() > 25) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        ArrayList<pessoa> listaPessoa = new ArrayList<pessoa>();
        //pessoa[] pessoaVetor = new pessoa[10];
        int qtdDeClientes = 10; // Se for usado mais clientes, altera-se esse número

        pessoa Pessoa1 = new pessoa("Joao da Silva", "masculino", 26, 5000);
        listaPessoa.add(Pessoa1);
        pessoa Pessoa2 = new pessoa("Pedro de Alcantra", "masculino", 17, 1000);
        listaPessoa.add(Pessoa2);
        pessoa Pessoa3 = new pessoa("Maria Josefina", "feminino", 30, 1000);
        listaPessoa.add(Pessoa3);
        pessoa Pessoa4 = new pessoa("Bruna Rubia", "feminino", 18, 1300);
        listaPessoa.add(Pessoa4);
        pessoa Pessoa5 = new pessoa("Leandro Sena", "masculino", 27, 2500);
        listaPessoa.add(Pessoa5);
        pessoa Pessoa6 = new pessoa("Levi Andre", "masculino", 28, 2000);
        listaPessoa.add(Pessoa6);
        pessoa Pessoa7 = new pessoa("Milena Bugoni", "feminino", 25, 4000);
        listaPessoa.add(Pessoa7);
        pessoa Pessoa8 = new pessoa("Guilherme Zuza", "masculino", 30, 13000);
        listaPessoa.add(Pessoa8);
        pessoa Pessoa9 = new pessoa("Victor Evaristo", "masculino", 24, 8000);
        listaPessoa.add(Pessoa9);
        pessoa Pessoa10 = new pessoa("Roberta Guerra", "feminino", 21, 4000);
        listaPessoa.add(Pessoa10);

        // Será usado apenas os nomes dados com exemplo, mas no caso
        // de adotar os 2000 clientes, seria usado um arquivo JSON, que seria lido com as informações de cadastro
        // E após isso, transformado num vetor de objetios
        // Seria feito algo como:
        // pessoa[] Pessoa = new pessoa[2000];

       System.out.println("Media de Idade dos Cliente: " + main.mediaIdadeLista(listaPessoa, qtdDeClientes));
       System.out.println("Media de salario das Mulheres: " + main.mediaSalarioMulher(listaPessoa, qtdDeClientes));
       System.out.println("Quantidade de pessoas com mais de 25 anos e com salário acima de 5000 reais: " + main.qtdPessoas25e5000(listaPessoa, qtdDeClientes));

        //Para 2000 clientes, o funcionamento do programa será o mesmo, apenas será feito modificações nas entradas
        //de dados e na variável qtdDeClietentes.
    }
}
