public class Conhecimento{
    private String nome;
    private String conteudo;


    public Conhecimento(String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getName(){
        return this.nome;
    }
    
    public String getconteudo(){
        return this.conteudo;
    }

}