public class Gojo extends Feiticeiro {
    public void atributoGojo(){
        if (nome == "Satoru Gojo"){
            System.out.println("Possui o Rikugan e o Mukagen");
        }
        else {
            System.out.println("Possui energia amaldiçoada infinita");
        }
    }
    @Override
    public void ataqueBase(){
        System.out.println("Golpe Físico Imbuído com Energia Amaldiçoada");
    }
}
