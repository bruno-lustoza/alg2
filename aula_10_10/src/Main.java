public class Main {
    public static void main(String[] args) {
        TokenFungivel tokenFungivel = new TokenFungivel("Token Fungível", 10.5, 100);
        System.out.println("Informações do Token Fungível:");
        tokenFungivel.exibirInfo();
        System.out.println();

        TokenNaoFungivel tokenNaoFungivel = new TokenNaoFungivel("Token Não Fungível", 1500.0, "ID12345ABC");
        System.out.println("Informações do Token Não Fungível:");
        tokenNaoFungivel.exibirInfo();

    }
}