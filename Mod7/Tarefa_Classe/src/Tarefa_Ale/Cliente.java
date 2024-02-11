
package Tarefa_Ale;

/**
 * @author Alessandro_Tavares
 *
 * 
 */
public class Cliente {

	private String nome;

	private String endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	// Metodos getters e setters para nome

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodos getters e setters para endereco

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
	}

}
