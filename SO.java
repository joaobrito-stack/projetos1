package exercicios;


public class SO {
	// criando uma classe 
	String tipodomodelo;
	public SO(String modelo) {
		//criando um metodo. São tipos funções de matemática
		this.tipodomodelo = modelo;
		System.out.println("Sistema criado:"+modelo);
		//printando alguma coisa
	}
	public void ligar() {
		System.out.println("ligando:" + this.tipodomodelo);
	}
}