package TarefaMod8;

public class Main {
    public static void main(String[] args) {
        // Definindo o nome e as notas do aluno
        String nome = "Alessandro";
        double[] notas = {7.5, 8, 6.5, 9};

        // Criando um objeto Aluno com o nome e as notas definidas
        Aluno aluno = new Aluno(nome, notas);

        // Exibindo as informações do aluno
        System.out.println("Informações do Aluno:");
        aluno.exibirInformacoes();
    }
}