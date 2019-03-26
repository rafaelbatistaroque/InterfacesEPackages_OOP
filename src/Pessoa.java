public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cidadeNasc;

    //Nome
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    //Idade
    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}

    //Cidade de nascimento
    public void setCidadeNasc(String cidadeNasc) {this.cidadeNasc = cidadeNasc;}
    public String getCidadeNasc() {return cidadeNasc;}
}
