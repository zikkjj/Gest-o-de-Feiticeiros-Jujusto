public class Feiticeiro {
    private String nome;
    String cla;
    int idade;

    // Getter - Criar Getter para mostrar ao usuário
    public String getNome(){
        return nome;
    }

    // Setter - Settar o valor da variável
    public void setNome(String nome){
        this.nome = nome; //o this.nome está se referindo ao private String nome da variavel
    }




    public void ataqueBase(){
        System.out.println("Golpe físico");
    }
}

