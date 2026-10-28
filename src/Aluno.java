
public class Aluno {

    private String nome;
    private int matricula;
    private int idade;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, int matricula, int idade,
                 double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        setNota1(nota1);
        setNota2(nota2);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException(
                    "A nota deve estar entre 0 e 10."
            );
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException(
                    "A nota deve estar entre 0 e 10."
            );
        }
    }

    // Calcula a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Verifica a aprovação
    public String verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    // Exibe os dados
    public void exibirDados() {
        System.out.println("===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
        System.out.println();
    }
}
