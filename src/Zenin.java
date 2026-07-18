public class Zenin extends Feiticeiro {

    public void atributoZenin(){
        if (getNome() == "Toji Fushiguro") {
            System.out.println("Possui Restrição Celestial");
        }
        else{
            System.out.println("Possui encantamento Hereditario");
        }
    }
    @Override
    public void ataqueBase(){
        System.out.println("Golpe físico com manejo de ferramentas amaldicoadas");
    }
}
