public class RegistroLivros {

    public static void main(String[] args){
        //Instacia de Autor
        Autor autor = new Autor();

        autor.setNome("Rafael Batista");
        autor.setIdade(32);
        autor.setCidadeNasc("Dourados");
        autor.setGenero("Tecnologia");
        autor.setFormacao(OpcoesFormacao.MESTRE);

        //Instancia do objeto Livro
        Livro livro = new Livro();

        livro.setNomeLivro("Engenharia de Software");
        livro.setAutorLivro(autor);
        livro.setEditoraLivro("AltaBooks");
        livro.setCidadeLivro("Campo Grande");
        livro.setAnoPublicacao(2019);
        livro.setEdicao(5);

        //Imprime na Tela
        livro.Imprimir(livro.generateCSV());
    }
}
