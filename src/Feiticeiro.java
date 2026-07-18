public class Feiticeiro {
    private String nome;
    private String cla;
    private int idade;

    // Getter - Criar Getter para mostrar ao usuário
    public String getNome(){
        return nome;
    }
    public String getCla(){
        return cla;
    }
    public int getIdade(){
        return idade;
    }

    // Setter - Settar o valor da variável
    public void setNome(String nome){
        this.nome = nome; //o this.nome está se referindo ao private String nome da variavel
    }

    public void setCla(String cla){
        this.cla = cla;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


    public void ataqueBase(){
        System.out.println("Golpe físico");
    }
}

