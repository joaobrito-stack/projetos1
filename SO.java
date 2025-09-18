package exercicios;


public class SO {
	// criando uma classe 
	String TipoDoModelo;
	public SO(String Modelo) {
		//criando um metodo. São tipos funções de matemática
		this.TipoDoModelo = Modelo;
		System.out.println("Sistema criado:"+Modelo);
		//printando alguma coisa
	}
	public void ligar() {
		System.out.println("ligando:" + this.TipoDoModelo);
	}
}