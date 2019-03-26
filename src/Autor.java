public class Autor extends Pessoa {
    private String genero;
    private OpcoesFormacao formacao;

    //Gênero do Livro
    public void setGenero(String genero) {this.genero = genero;}
    public String getGenero() {return genero;}

    //Formação acadêmica
    public void setFormacao(OpcoesFormacao formacao) {this.formacao = formacao;}
    public OpcoesFormacao getFormacao() {return formacao;}
}
