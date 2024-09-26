
public class Main {
    public static void main(String[] args) {

        //System.out.printf("Hello and welcome!");
        Pessoa bruno = new Pessoa("Bruno",19);

        System.out.println("Nome: " + bruno.getNome());
        System.out.println("Idade: " + bruno.getIdade());
        bruno.cumprimentar(bruno.getNome());
    }
}



