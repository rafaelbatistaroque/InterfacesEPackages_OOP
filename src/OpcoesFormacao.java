public enum OpcoesFormacao {
    ESPECIALISTA("Especialista"),
    MESTRE("Mestre"),
    DOUTOR("Doutor"),
    NENHUM("Nenhum");

    private String formacaoEnum;

    //Set a string no atributo
    OpcoesFormacao(String formacaoEnum){
        this.formacaoEnum = formacaoEnum;
    }

    //Obter a string do enum
    public String getFormacaoEnum() {
        return formacaoEnum;
    }
}
