public class Main {
    public static void main(String[] args) {

       //OBJ 1
        Gojo Satoru = new Gojo();
        Satoru.setNome("Satoru Gojo");
        Satoru.getNome();
        Satoru.setIdade(35);
        Satoru.getIdade();
        Satoru.setCla("Gojo");
        Satoru.getCla();
        System.out.println("Nome: " +Satoru.getNome());
        Satoru.atributoGojo();
        Satoru.ataqueBase();



        //OBJ 2
        Zenin Megumi = new Zenin();
        Megumi.setNome("Megumi Fushiguro");
        Megumi.getNome();
        Megumi.setIdade(23);
        Megumi.getIdade();
        Megumi.setCla("Zenin");
        Megumi.getCla();
        System.out.println("Nome: " +Megumi.getNome());
        Megumi.ataqueBase();
        Megumi.atributoZenin();


    }
}