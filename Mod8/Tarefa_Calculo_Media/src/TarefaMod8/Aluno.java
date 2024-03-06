package TarefaMod8;


/**
 * @author Alessandro Tavares
 */

  public class Aluno {
	private String nome;
	private double[] notas;
	
	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;		
	}
	
	// Método para calcular a média das notas do aluno
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
	
	
	// Método para exibir as informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("    Notas");
        System.out.println("  ---------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Média: " + calcularMedia());
    }
	
	
}
