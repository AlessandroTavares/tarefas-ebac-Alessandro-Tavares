
package Tarefa_Ale;

/**
 * @author Alessandro_Tavares
 */
public class Funcionario {

	private String codigo;

	private String nome;

	public Funcionario(String nome, String codigo) {
		this.codigo = codigo;
		this.nome = nome;
	}

	// Metodos getters e setters para codigo

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// Metodos getters e setters para nome

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
