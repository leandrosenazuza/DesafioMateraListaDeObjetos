package br.com.leandrosenazuza;

class pessoa{
    public String nome;
    public String sexo;
    public int idade;
    public double salario;

    public pessoa(String nome, String sexo, int idade, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}