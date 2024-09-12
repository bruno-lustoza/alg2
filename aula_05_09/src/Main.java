
public class Main {
    public static void main(String[] args) {

        Conceitos.Aluno aluno = new Conceitos.Aluno();

        aluno.setNome("Bruno");
        System.out.println("Nome do Aluno: " + aluno.getNome());
    }

    public static class Conceitos {
        //Poo: Programação Orientada a Objetos (POO): É uma abordagem que usa Classes e Objetos para organizar e gerenciar o código, facilitando sua estruturação, modificação e reutilização.
        //Classes é o modelo conceitual que une os estruturas, dados e comportamentos relacionados
        //Atributos São os caracteristicas associados as classes
        //Métodos São as açoes ou funções associadas as classes
        //Objeto É uma instância da classe

        //Importancia:
        //A Programação Orientada a Objetos (POO) é crucial no desenvolvimento de software moderno
        //devido à sua capacidade de organizar e estruturar o código de maneira eficiente. Ao usar Classes e
        //Objetos, a POO permite a criação de sistemas mais modularizados e compreensíveis, facilitando a
        //manutenção e a evolução do software. Essa abordagem promove a reutilização de código, reduzindo
        //a redundância e o esforço necessário para implementar novas funcionalidades. Além disso, a POO
        //facilita a resolução de problemas complexos, permitindo uma modelagem mais intuitiva do mundo
        //real. Com isso, desenvolvedores podem criar aplicações mais robustas e escaláveis, melhorando a qualidade e a eficiência dos projetos.


        public static class Aluno {


            String nome;
            String cpf;
            int idade;
            boolean alunoMatriculado;


            public String getNome() {
                return nome;
            }

            public void setNome(String newNome) {
                this.nome = newNome;
            }
        }

    }
}