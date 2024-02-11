
package Tarefa_Ale;

/**
 * @author Alessandro_Tavares
 */

public class Carro {

	private String marca;

	private String modelo;

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	/*
	 * Entendendo a estrutura Carro carro = new Carro("Toyota", "Corolla");
	 * System.out.println("Carro: " + carro.getMarca() + "/" + carro.getModelo());
	 * Console imprimi Carro: Toyota/Corolla
	 */

	// Metodos getters e setters para marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodos getters e setters para modelo

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
