import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller{
    private List<Conhecimento> conhecimentosdisp;
    private List<Conhecimento> conhecimentosproj;

//rodar o controller
    public void Start(){
        conhecimentosdisp =new ArrayList<>();
         
        //instanciar os conhecimentos
        initconhecimentos();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual seu nome?  ");
        String nome_pessoa = sc.nextLine();
        Pessoa p =  new Pessoa(nome_pessoa);

        // System.out.print("Quais desses conhecimentos você tem? (enter vazio para parar) ");
        // printConhecimentos();
        // String conhecimentos = sc.nextLine();
        // if(conhecimentos.isEmpty()){
        //     System.out.println("a")
        // }else{
        //     while(true){
                

        //     }
        // }

        System.out.print("qual o nome do projeto?");
        String nome_projeto = sc.nextLine();
        insertConhecimentos();

        Projeto projetin =  new Projeto(nome_projeto, conhecimentosproj);


        
    }

    public void printConhecimentos(){
        for (int i = 0; i <conhecimentosdisp.size(); i++){
            System.out.println(i + " nome: " + conhecimentosdisp.get(i).getName() + " | conteudo: " + conhecimentosdisp.get(i).getName());
        }
    }
    public void initconhecimentos(){
        conhecimentosdisp.add(new Conhecimento("Fundamentals of Image Formation", "Forming a Digital Image"));
        conhecimentosdisp.add(new Conhecimento("Satellite Image Processing", "Spatial resolution"));
        conhecimentosdisp.add(new Conhecimento("Digital Image Processing Basics", "Image acquisition and Image enhancement"));
        conhecimentosdisp.add(new Conhecimento("CNN | Introduction to Pooling Layer", "Pooling layers are used to reduce the dimensions of the feature maps"));
        conhecimentosdisp.add(new Conhecimento("Convolutional Neural Network (CNN) Architectures", "LeNet-5 and AlexNNet"));
    }
    public void insertConhecimentos(){
        List<Conhecimento> conhecimentosproj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i > -1){
            printConhecimentos();
            System.out.print("insira o numero do conhecimento necessario para o projeto, -1 para parar");
            if(0 < i ){
                i = Integer.parseInt(sc.nextLine());
                conhecimentosproj.add(conhecimentosdisp.get(i));
            }
            
        }
        sc.close();
    }

}