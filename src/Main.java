
public class Main {

    public static void main(String[] args) {

        // Criando o primeiro objeto
        Aluno aluno1 = new Aluno(
                "Sandra Silva", 1001, 18, 8.0, 6.0
        );

        // Criando o segundo objeto
        Aluno aluno2 = new Aluno(
                "Jayme Santos", 1002, 23, 10.0, 5.0
        );

        // Exibindo os dados
        aluno1.exibirDados();
        aluno2.exibirDados();
    }
}
