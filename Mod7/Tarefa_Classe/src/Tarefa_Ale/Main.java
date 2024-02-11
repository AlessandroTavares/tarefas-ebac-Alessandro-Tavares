

package Tarefa_Ale;

/**
 * @author Alessandro_Tavares
 */

public class Main {

	public static void main(String[] args) {
		
		// Criando um objeto Carro 
		Carro carro = new Carro("Toyota", "Corolla");
		
		// Criando um objeto Funcionario
		Funcionario funcionario = new Funcionario("Alessandro", "25");
		
		// Criando um objeto Cliente
		Cliente cliente = new Cliente("Maria", "Rua das Flores");
		
		// Exibindo informacoes
		System.out.println("Carro: " + carro.getMarca() + "/" + carro.getModelo());
        System.out.println("Funcionário: " + funcionario.getNome() + ", Cod: " + funcionario.getCodigo());
        System.out.println("Cliente: " + cliente.getNome() + ", Endereço: " + cliente.getEndereco());
    }
		
	

		
		
		
}
	
	