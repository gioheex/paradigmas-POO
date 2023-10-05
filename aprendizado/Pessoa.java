import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Conhecimento> conhecimentos;

    public Pessoa(String nome){
        this.nome = nome;
        conhecimentos = new ArrayList<>();
    }

    
}
