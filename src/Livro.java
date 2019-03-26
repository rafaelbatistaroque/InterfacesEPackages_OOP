import interfaces.CSVGenerator;

/**
 * @author Rafael Batista
 */
public class Livro implements CSVGenerator {

    //Atributos da Classe
    private String nomeLivro;
    private Autor autorLivro;
    private String editoraLivro;
    private String cidadeLivro;
    private int  anoPublicacao;
    private int edicao;

    //MÉTODOS SETTERS
    //Nome do Livro
    public void setNomeLivro(String nome) {this.nomeLivro = nome;}
    public String getNomeLivro() {return nomeLivro;}

    //Autor do Livro
    public void setAutorLivro(Autor autor) {this.autorLivro = autor;}
    public Autor getAutorLivro() {return autorLivro;}

    //Editora
    public void setEditoraLivro(String editora) {this.editoraLivro = editora;}
    public String getEditoraLivro() {return editoraLivro;}

    //Cidade de pulicação
    public void setCidadeLivro(String cidade) {this.cidadeLivro = cidade;}
    public String getCidadeLivro() {return cidadeLivro;}

    //Ano de publicação
    public void setAnoPublicacao(int anoPublicacao) {this.anoPublicacao = anoPublicacao;}
    public int getAnoPublicacao() {return anoPublicacao;}

    //Edição
    public void setEdicao(int edicao) {this.edicao = edicao;}
    public int getEdicao() {return edicao;}

    //MÉTODOS
    //Overload interface
    @Override
    public String generateCSV() {
        return getNomeLivro() + ";"
                + getAutorLivro().getNome() + ";"
                + getCidadeLivro() + ";"
                + getEditoraLivro() + ";"
                + getAnoPublicacao();
    }

    //Imprime na tela o retorno do generateCSV.
    public void Imprimir(String CSV){
        System.out.println(CSV);
    }
}
